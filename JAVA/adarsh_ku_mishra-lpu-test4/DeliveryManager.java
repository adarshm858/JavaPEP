import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class DeliveryManager {
    private List<Delivery> allDeliveries;
    private Map<String, Delivery> deliveryMap;
    private PriorityQueue<Delivery> processingQueue;

    public DeliveryManager() {
        this.allDeliveries = new ArrayList<>();
        this.deliveryMap = new HashMap<>();
        // Priority descending, if tied then keep original order is tricky with PQ, but we rely on natural heap insertion
        this.processingQueue = new PriorityQueue<>(new PriorityComparator());
    }

    public void loadFromFile(String file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                try {
                    String[] parts = line.split(",");
                    if (parts.length != 4) throw new IllegalArgumentException("Invalid line format");
                    String id = parts[0].trim();
                    String type = parts[1].trim();
                    String name = parts[2].trim();
                    double distance = Double.parseDouble(parts[3].trim());
                    
                    Delivery d = DeliveryFactory.createDelivery(type, id, name, distance);
                    allDeliveries.add(d);
                    deliveryMap.put(id, d);
                    processingQueue.add(d);
                } catch (Exception e) {
                    System.err.println("Error parsing line: " + line + " - " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    public void processDeliveries() {
        System.out.println("\n===== Processing Queue =====");
        PriorityQueue<Delivery> tempQueue = new PriorityQueue<>(new PriorityComparator());
        tempQueue.addAll(processingQueue);
        while (!tempQueue.isEmpty()) {
            Delivery d = tempQueue.poll();
            String priorityStr = d.getPriority() == 3 ? " (High Priority)" : "";
            System.out.println("Processing: " + d.getDeliveryId() + priorityStr);
            try {
                d.updateStatus("IN_TRANSIT");
            } catch (Exception e) {
                System.err.println("Status error for " + d.getDeliveryId() + ": " + e.getMessage());
            }
        }
    }

    public void serialize(String file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(allDeliveries);
            System.out.println("\n===== Serialization =====\nData saved successfully.");
        } catch (IOException e) {
            System.err.println("Serialization error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public List<Delivery> deserialize(String file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            List<Delivery> restored = (List<Delivery>) ois.readObject();
            System.out.println("\n===== After Deserialization =====\nRestored " + restored.size() + " deliveries.");
            return restored;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization error: " + e.getMessage());
        }
        return new ArrayList<>();
    }

    public double getTotalRevenue() {
        return allDeliveries.stream().mapToDouble(Delivery::calculateCost).sum();
    }

    public Map<String, Integer> getDeliveryCountByType() {
        Map<String, Integer> countMap = new LinkedHashMap<>();
        for (Delivery d : allDeliveries) {
            countMap.put(d.getType(), countMap.getOrDefault(d.getType(), 0) + 1);
        }
        return countMap;
    }

    public List<Delivery> getTopNDistancedDeliveries(int n) {
        return allDeliveries.stream()
                .sorted(new DistanceComparator().reversed()) // Longest distances first
                .limit(n)
                .collect(Collectors.toList());
    }

    public void printDeliveries() {
        System.out.println("===== All Deliveries =====");
        for (Delivery d : allDeliveries) {
            System.out.println(d);
        }
    }

    public void printSortedByCost() {
        System.out.println("\n===== Sorted by Cost (Desc) =====");
        List<Delivery> sorted = new ArrayList<>(allDeliveries);
        sorted.sort(new CostComparator());
        List<String> ids = sorted.stream().map(Delivery::getDeliveryId).collect(Collectors.toList());
        System.out.println(String.join(" > ", ids));
    }
    
    // Comparators
    static class CostComparator implements Comparator<Delivery> {
        @Override
        public int compare(Delivery d1, Delivery d2) {
            return Double.compare(d2.calculateCost(), d1.calculateCost()); // Descending
        }
    }

    static class DistanceComparator implements Comparator<Delivery> {
        @Override
        public int compare(Delivery d1, Delivery d2) {
            return Double.compare(d1.getDistance(), d2.getDistance()); // Ascending
        }
    }

    static class PriorityComparator implements Comparator<Delivery> {
        @Override
        public int compare(Delivery d1, Delivery d2) {
            return Integer.compare(d2.getPriority(), d1.getPriority()); // Descending
        }
    }
}
