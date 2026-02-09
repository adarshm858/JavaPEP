package Questions.testQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class SecondHighestNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter the Array : ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 0; i < num; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondlargest && arr[i] != largest) {
                 secondlargest=arr[i];
            }
        }
        System.out.println(secondlargest);

    }
}











