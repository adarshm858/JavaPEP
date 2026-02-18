package MultiThreading;

public class ThreadStateTimeWaitng {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello" + i+ " From "+ Thread.currentThread());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(t1.getState()); //NEW
        t1.start();
        System.out.println(t1.getState()); //RUNNABLE

        Thread.sleep(2000);
        System.out.println(t1.getState()); //TIME WAITING
        Thread.sleep(2000);

        System.out.println("END" + Thread.currentThread());
    }
}
