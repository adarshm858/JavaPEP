package io;

import java.io.*;

public class ImageCopier {
    static void main(String... args) {
        String sourcePath = "/Users/adi/Java Full Stack/JavaPEP/JAVA/io/dc2069862c7b53622f34908de12ec245.jpg";
        String destinationPath = "/Users/adi/Java Full Stack/JavaPEP/JAVA/io/adrash.jpg";
//        System.out.println(new File(sourcePath).exists());
//        System.out.println(new File(destinationPath).exists());
        try (
                InputStream in = new FileInputStream(sourcePath);
                OutputStream out = new FileOutputStream(destinationPath);

        ) {
            byte[] buffer = new byte[1024];
            int read;
            while ((read = in.read(buffer)) != 1) {
                out.write(buffer, 0, read);
                System.out.println("Copied");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
