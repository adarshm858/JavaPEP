package inheritance;

public class Animal {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.run();}
        void run() {
            System.out.println("Animal is running");
        }
    }

    class Tiger extends Animal{
        void run () {
            System.out.println("Tiger is running");
        }
    }
