package Questions;

import java.math.BigInteger;

public class BigIntDemo {
    public static void main(String[] args){
        long maxlong = Long.MAX_VALUE;
        long overflowed = maxlong +10;
        System.out.println("Overflowed Long" + overflowed);
        BigInteger bigNum = BigInteger.valueOf(maxlong);
        BigInteger result =bigNum.multiply(BigInteger.valueOf(10));
        System.out.println("BigInteger Reuslt: "+result);
    }
}
