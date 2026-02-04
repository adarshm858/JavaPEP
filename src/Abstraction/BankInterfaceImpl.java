package Abstraction;

public class BankInterfaceImpl extends OfflineBank  implements BankInterface ,RBI, ComplexCase {
    String name ;
    long balance;
    long accountNumber;
    String ifcsCode;
    AccountType accountType;

    public BankInterfaceImpl(long accountNumber, AccountType accountType, long balance, String ifcsCode, String name) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.ifcsCode = ifcsCode;
        this.name = name;
    }

    @Override
    public void deposit(long... amounts) {
        for(long amt: amounts){
            if(amt<=0){
                logger.warning("Invaild amounts");
            }else {
                balance += amt;
            }
        }
        logger.info("New Balance is "+balance);
    }

    @Override
    public void withdraw(long amounts) {
        if(amounts>0){
            if(balance>=amounts){
                balance-=amounts;
            }else{
                logger.warning("invalid amount");
            }
            logger.info("New Balance is " + balance);
        }
    }

    @Override
    public boolean isLicensed() {
        return true;
    }
}
