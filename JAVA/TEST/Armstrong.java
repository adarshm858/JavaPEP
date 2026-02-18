package TEST;

public class Armstrong {

        public void main(String[] args){
            int number = 153;
            int sum = 0;
            for (int i = number; i > 0; i = i / 10) {
                int digit = i % 10;
                sum += (digit * digit * digit);
            }

            if (sum == number) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }
    }


