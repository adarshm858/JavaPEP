package inheritance;

public class Multi_Level_Inheritance {

    public  void main(String[] args) {
        C c = new C();
        c.test();
//        System.out.println(c.x);
        A a = new A();

    }
    class A{
        int x=12;
        private int y=80;


    }
    class B extends A{
        int x=100;

    }
    class C extends B{
        int x=1000;
        void test(){
            System.out.println(x); // 1000
            System.out.println(super.x);//100
//            System.out.println(super.super.x);
        }
    }

}

//CLASS
