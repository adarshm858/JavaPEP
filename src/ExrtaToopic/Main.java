package ExrtaToopic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(){
        System.out.println("START");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = {22,43,6,5};
        try {
            System.out.println(10 / arr[num]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exection Occurred");
            e.printStackTrace();

        }catch (ArithmeticException e){
            System.out.println("Exection Occurred ");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("Exection Occurred");
            e.printStackTrace();
        }catch (Exception e){                // :---Always put the default Exception block at the end.---: //
            System.out.println("Exection Occurred");
            e.printStackTrace();
        }
        System.out.println("END");
    }

}
