package ClassWeeklyTest.opps;
    public class UpiPayment extends Payment {
        public UpiPayment(long amount) {
            super(amount);
        }

        @Override
        void setUpiPay(long amount) {
            balance -= amount;
            System.out.println("UPI Paid: " + amount + ". Remaining Balance: " + balance);
        }

        @Override
        void setCardPayment(long... amounts) {}
    }

