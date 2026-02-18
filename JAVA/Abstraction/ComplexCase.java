package Abstraction;

public interface ComplexCase {
    static void call(){
        System.out.println("Complex Case");
    }
    default void ring(){
        System.out.println("Ringing ... ");
    }
}
