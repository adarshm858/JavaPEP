package Exceptions;

import java.util.Scanner;

public class TryWithResource {
    public static void main(){


        try(Scanner sc = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
        ) {
                int num =sc.nextInt();
                for(int i=0;i<101;i++){
                    Thread.sleep(500);
                    System.out.println(i);
                }

        }catch (InterruptedException e){
                throw new RuntimeException(e);
        }finally {
            System.out.println("Finally block executed");
        }
    }
}
