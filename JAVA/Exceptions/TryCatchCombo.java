package Exceptions;

import java.util.Scanner;

public class TryCatchCombo {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         try{
            for (int i = 0; i < 10; i++) {
                Thread.sleep(50);
                System.out.println(i);
            }
            //return;
             //
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("Finally block executed");
                sc.close();
            }
         Scanner sc2=null;
         try{
             sc2 =new Scanner(System.in);
             System.out.println(8/ sc2.nextInt());
         }finally {
          //   sc2.close;
         }

        }

    }

