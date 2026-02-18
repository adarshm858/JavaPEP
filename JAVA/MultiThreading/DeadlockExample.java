package MultiThreading;

public class DeadlockExample {
    static void main(String[] args) {
        final String resource1="Bowl";
        final String resource2="Spoon";

        Thread t1 = new Thread(()->{
            synchronized (resource1){
                System.out.println("Thread 1: Locked: "+resource1);
            }try {
                Thread.sleep(100);
            } catch (Exception e){

            }
            System.out.println("Thread 1 : Waiting for: "+resource2+" ....");
            synchronized (resource2){
                System.out.println("thread 1 locked both: ");
            }
        });

        Thread t2 = new Thread(()->{
            synchronized (resource2){
                System.out.println("Thread 2: Locked"+resource2);
            }try {
                Thread.sleep(100);
            } catch (Exception e){

            }
            System.out.println("Thread 2 : Waiting for"+resource1+"....");
            synchronized (resource1){
                System.out.println("thread 2 locked both: ");
            }
        });
        t1.start();
        t2.start();
    }
}
