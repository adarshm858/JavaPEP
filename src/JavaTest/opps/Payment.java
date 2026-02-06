package JavaTest.opps;

 abstract  public class Payment {



        long amount;
        int balance = 10000; // Simplified to one balance for the example

        public Payment(long amount) {
            this.amount = amount;
        }

        // Every child MUST implement these
        abstract void setCardPayment(long... amounts);
        abstract void setUpiPay(long amount);
    }


