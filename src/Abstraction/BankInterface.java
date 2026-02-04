package Abstraction;

import java.util.logging.Logger;

public interface BankInterface {
    public static final Logger logger = Logger.getLogger(BankInterface.class.getName());


    void deposit(long ... amounts);
    abstract void withdraw (long amounts);

}
