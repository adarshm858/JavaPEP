package ClassWeeklyTest.opps;
import java.util.Arrays;
    public class Main {
        public static void main(String[] args) {
            // Create objects
            CredicardPayment c1 = new CredicardPayment(567);
            UpiPayment u1 = new UpiPayment(40);

            // Call the methods
            c1.setCardPayment(100, 200, 50); // Using varargs
            u1.setUpiPay(40);
        }
    }

