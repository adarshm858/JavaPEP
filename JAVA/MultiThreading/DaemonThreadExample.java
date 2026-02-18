package MultiThreading;

public class DaemonThreadExample {
    static void main(String[] args) {
        Thread d1 = new Thread(()->{
            while (true){
                try{
                    System.out.println("Daemon thread working in the background ...");
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        d1.setDaemon(true);
        d1.start();
    try{
        System.out.println("Main  thread is starting its works ... ");
        Thread.sleep(3000);
        System.out.println("Main thread is Finsihed! ");
    }catch(InterruptedException e){
        e.printStackTrace();
    }
        System.out.println("Main thread is existing ... ");

}}
