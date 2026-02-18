package MultiThreading;

public class Main {
   public  static void main(String[] args) throws InterruptedException {
        System.out.println("START");

        System.out.println(Thread.currentThread());
        Worker t1= new Worker();

      //  t1.run();
        t1.setName("t1");
        t1.setName(String.valueOf(Thread.MAX_PRIORITY));
        t1.start();

       Worker t2= new Worker();
       //t1.run();
       t2.setName("t2");
       t2.setName(String.valueOf(Thread.MIN_PRIORITY));
       t2.start();

       Thread t3 = new Thread(new Work());

       t3.setName("t3");
       t3.setName(String.valueOf(Thread.NORM_PRIORITY));
       t3.start();

       Thread t4 = new Thread(new Work());

       t4.setName("t3");
       t4.setPriority(2);
       t4.start();


       System.out.println("END");
    }
}
