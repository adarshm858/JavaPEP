package MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class RaceConditionFixed {
    static AtomicInteger counterAtomic = new AtomicInteger(0);
    static int counter = 0;
    public static void incrementCounterAtomic(){counterAtomic.incrementAndGet();}

    public static synchronized void  incrementCounter(){counter++;}

    static void main(String[] args) {
        Thread thread1 = new Thread(() -> incrementCounterAtomic());
        Thread thread2 = new Thread(() -> incrementCounterAtomic());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Counter value : " +counterAtomic);
//        System.out.println("Counter value : " +counterAtomic.incrementAndGet());

    }}


