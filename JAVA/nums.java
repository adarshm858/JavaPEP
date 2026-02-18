import java.util.Scanner;

public class nums {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int a = scanner.nextInt() ;
        for (int b = 1; b<=a;b++) {
            System.out.println(b);
        }
    }
}
