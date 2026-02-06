package ClassWeeklyTest.opps;

    public class CredicardPayment extends Payment  {
        public CredicardPayment(long amount) {
            super(amount);
        }

        @Override
        void setCardPayment(long... amounts) {
            for (long amt : amounts) {
                balance -= amt;
                System.out.println("Card Paid: " + amt);
            }
            System.out.println("Final Balance: " + balance);
        }

        @Override
        void setUpiPay(long amount) {}
    }


