package Test;

public class DOB1 {
    public void main(String[] args) {
        String str = "15102002";
        int year = Integer.parseInt(str.substring(4, 8));

        System.out.println(year);
        if(year / 4 ==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
