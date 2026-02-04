package Abstraction;

import java.util.logging.Logger;

public class BankAccount {

    String name;
    long balance;
    long accountNumber;
    String ifscCode;
    AccountType accountType;

    Logger logger = Logger.getLogger(BankAccount.class.getName());

    public BankAccount(String name, String ifscCode, AccountType accountType, long accountNumber) {
        this.name = name;
        this.ifscCode = ifscCode;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = 1000L;

    }

    boolean deposit(long... amount) {
        for (long amt : amount) {
            if (amt <= 0) {
                logger.warning("Invalid amount");
            } else {
                balance += amt;
            }
            logger.info("New Balance is: "+balance);
        }return true;
    }

        void withdraw (long amount){
            if(amount >0){
                if(balance >= amount){

                } else if (amount>balance) {
                    logger.warning("insifficient Balance");
                } else{
                    balance-=amount;
                    logger.warning("Balance is SuccesFully withdraw: "+balance);
                }
            }
        }
        void checkBalance(){
            logger.info("Balance:"+balance);
        }


    }
