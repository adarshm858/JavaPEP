package Abstraction;

import java.util.Arrays;

public class main {
    public static void main(String[]args ){
        BankInterface ac4=new BankInterface() {
            @Override
            public void deposit(long... amounts) {
                System.out.println("Deposting : " + Arrays.toString(amounts));
            }

            @Override
            public void withdraw(long amounts) {
                System.out.println("Withdrawing: "+amounts);
            }
        };
        ac4.deposit(54785 );
        ac4.withdraw(1000);
//       BankAccount ac1= new BankAccount("Akku","hdfc3894d",AccountType.SAVING,65859);
//
//
//        ac1.deposit(32,3,2323,3,-9);
//        System.out.println(ac1);
//        ac1.withdraw(350);
//        System.out.println(ac1);
//        ac1.checkBalance();
//        System.out.println(ac1);
//
//    }





}}
