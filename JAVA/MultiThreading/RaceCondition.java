package MultiThreading;

public class RaceCondition {
int  counter =0;
public void incermentCounter(){
    counter++;
}
    static void main(String[] args) {
        RaceCondition raceCondition = new RaceCondition();
        Thread thread1 = new Thread(()->raceCondition.incermentCounter());
        Thread thread2 = new Thread(()->raceCondition.incermentCounter());
        //start both threads
        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Counter value : "+raceCondition.counter);
        System.out.println("Counter value : "+raceCondition.counter);

    }
}
