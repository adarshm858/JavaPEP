package DesignPattern;

public class PrimeMinister {
    String name;
    int age;
    private static PrimeMinister pm;
//1.  Make the constructor private
    private PrimeMinister(String name,int age){
//    public PrimeMinister(String name, int age) {
        this.age = age;
        this.name = name;
    }

   // 3. Make a static that will create an object for pm

    static PrimeMinister declarePm(String name,int age) {
        if (pm == null) {
            pm = new PrimeMinister(name, age);
        }
        return pm;
    }

    @Override
    public String toString() {
        return "PrimeMinister{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
