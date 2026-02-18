package MultiThreading;

public class Work implements Runnable {
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            try{
                Thread.sleep(500);
                System.out.println("Hello" + i + "from" + Thread.currentThread());
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
