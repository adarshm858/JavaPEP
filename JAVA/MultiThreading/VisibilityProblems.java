package MultiThreading;

public class VisibilityProblems {



     volatile static boolean flag = true;

     // if you mark a variable as volatile it means thats any thread reads the varible will see the most recent
    // values written to it by any other thread .This  is because the volatile keyword ensures that all threads see the
    // same value of the varibales ,and that any change made to  the varible by the  one thread are immediately visible
    // to all


    static void main(String[] args) {
        Thread t1= new Thread(()->{
            while (flag){
                System.out.println("Stop me if you can !! ");
            }
        });
        t1.start();
        Thread t2= new Thread(()->{
                flag=false;
        });
        t2.start();


    }

}
