package Abstraction;

@FunctionalInterface
public interface LokSabha {
    void elect(int condidates);
//    void election();
    static void members(){
        System.out.println("There are "+543+ "members in Loksabha");
    }
    default void locationOfLokSabha(){
        System.out.println("Location is Delhi ");
    }
}
