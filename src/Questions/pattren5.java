package Questions;

public class pattren5 {
    public static  void  main(){
        int n=4;
        for (int i = 1; i<=n;i++){
            for (int j = 1; j<=n-i;j++){//change the row
                System.out.print("*");
            }
            for (int k = 1; k<=i;k++){//Print the invert trend
                System.out.print("#");
            }
            System.out.println();//change Line
        }
    }
}
