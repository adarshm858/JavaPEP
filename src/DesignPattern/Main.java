package DesignPattern;

public class Main {
    static void main(){
/*        PrimeMinister pm1 =new PrimeMinister("Mr Modi",62);
        System.out.println(pm1);
        System.out.println(pm1.hashCode());

        PrimeMinister pm2 =new PrimeMinister("Rahul",54);
        System.out.println(pm2);
        System.out.println(pm2.hashCode());*/



        PrimeMinister pm1 =PrimeMinister.declarePm("Mr Modi",63);
        System.out.println(pm1);
        System.out.println(pm1.hashCode());
        PrimeMinister pm2 =PrimeMinister.declarePm("Mr Modi",63);
        System.out.println(pm2);
        System.out.println(pm2.hashCode());
    }
}
