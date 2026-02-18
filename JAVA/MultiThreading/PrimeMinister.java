package MultiThreading;

public class PrimeMinister {
    String name;
    int age;
    private static PrimeMinister pm;
    private PrimeMinister(String name,int age){
        this.name=name;
        this.age=age;

    }
    synchronized static PrimeMinister declarePM(String name,int age){
        if (pm==null){
            pm = new PrimeMinister(name,age);
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
