//package io;
//
//import java.io.File;
//import java.io.IOException;
//
//public class FIleOperationCreateDelete {
//
//    static void main(String ... args) {
//        File file = new File(FilePaths.SAMPLE_FOLDER_ABSOLUTE_PATH+"sample2.txt");
//        if (file.exists()){
//            System.out.println("File Exists");
//        }try {
//            boolean newFile=file.createNewFile();
//
//        }catch (IOException e){
//            throw new RuntimeException();
//        }
//
//    }
//}
