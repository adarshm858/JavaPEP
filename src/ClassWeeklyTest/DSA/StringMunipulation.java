package ClassWeeklyTest.DSA;
import java.util.Scanner;
public class StringMunipulation {

    public class StringManipulation {
        public static void main(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number");
            int n = sc.nextInt();

            System.out.println("Enter the String");
            sc.nextLine();
            String s =sc.nextLine();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(s);
            }
            String result = sb.toString().toUpperCase();
            System.out.println(result);

        }
    }



}
