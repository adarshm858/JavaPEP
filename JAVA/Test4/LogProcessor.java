package Test4;

import java.io.*;

public class LogProcessor implements Runnable {

    private final File file;
    private final ActivityAggregator aggregator;

    public LogProcessor(File file, ActivityAggregator aggregator) {
        this.file = file;
        this.aggregator = aggregator;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                processLine(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file " + file.getName() + ": " + e.getMessage());
        }
    }

    private void processLine(String line) {
        String[] parts = line.trim().split("\\s+");
        if (parts.length == 3) {
            String userId = parts[1];
            aggregator.addActivity(userId);
        }
    }
}