package MultiThreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    static void main(String[] args) {
        //1. Create a pool with  to the pool
        try (
                ExecutorService executor = Executors.newFixedThreadPool(3);

        ) {
            // 2.Submit 5 tasks to the pool
            for (int i = 1; i <= 100; i++) {
                int taskId = i;
                executor.submit(() -> {
                    String threadName = Thread.currentThread().getName();
                    System.out.println("Task" + taskId + " is being executed by" + threadName);
                    try {
                        Thread.sleep(500); // simulate work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            }
            executor.shutdown();
        }
    }}
