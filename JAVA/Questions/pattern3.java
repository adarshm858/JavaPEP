package Questions;

public class pattern3 {
    public static void main(String[] args) {
        int n = 6;
        char ch = 'a';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

