package ClassWeeklyTest.opps;

 abstract public class Payment {
     int amount;
     String CardPayment;
     String UpiPayment;

     public Payment(int amount, String cardPayment, String UpiPayment) {
         this.amount = amount;
         CardPayment = cardPayment;
         UpiPayment = UpiPayment;
     }

     @Override
     public String toString() {
         return "Payment{" +
                 "amount=" + amount +
                 ", CardPayment='" + CardPayment + '\'' +
                 ", UpiPayment='" + UpiPayment + '\'' +
                 '}';
     }

 }
