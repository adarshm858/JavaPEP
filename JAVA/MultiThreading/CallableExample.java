package MultiThreading;

import java.util.concurrent.*;

public class CallableExample {
    static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Double> heavyTask =()->{
            double sum=0;
            System.out.println("Computation started in background... ");
            for (int i = 1; i <10_000_000 ; i++) {
                sum+=Math.sqrt(i);
            }
            Thread.sleep(1000);
            return sum;
        };
        Future<Double> future = executor.submit(heavyTask);
        System.out.println("Main thread: I'm not Blocked! I can Print this immeediately.");

        Double total = future.get();
        System.out.println("Computation Complete! Total sum"+total);
        executor.shutdown();
    }
}
