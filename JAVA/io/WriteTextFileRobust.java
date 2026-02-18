//package io;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class WriteTextFileRobust {
//    static void main(String ... args) {
//        File  path = new File(File.SAMPLE_FILE_ABSOLUTE_PATH);
//        String msg = """
//                Be Ready for tests On Friday
//                This is gonna be funn 😅😅
//
//                """;
//
//        if (path.exists() && path.isFile()){
//            try (FileOutputStream fos = new FileOutputStream(path,true);){
//                fos.write(msg.getBytes());
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//
//
//        }
//
//
//    }
//}
