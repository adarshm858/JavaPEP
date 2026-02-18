package TypeCasting;

public class typeCasting{
    public static void main (String[] args){
        Bird b1 =new Bird();
        b1.eat();
        b1.fly();
//        System.out.println(b1.wingSpan);
//        System.out.println(b1.isExtinct);

        Animal1 a2 = b1;


        a2.eat();
        System.out.println(a2.isExtinct);
        Animal1 a3= new Bird();    // Upcasting

        if(a3 instanceof Bird){   // it is a parameter that check the downcasting Here a3 is upcasted or not
            Bird mybird = (Bird) a3;        // Downcasting    Only if upcasting is done then it will
            // downcasting other wise it will through an error

            mybird.fly();
            mybird.eat();


        }
        else{
            System.out.println("this animal can't fly");
        }
//        child c1 = new child();
//        System.out.println(c1.x);
//        System.out.println(c1.y);
//
//        c1.fun2();
//        c1.fun1();
//
//        parent p1 = c1;    //  -> Upgrading a child to parent   -> UpCasting & its Implicit
//        System.out.println(p1.x);
//        System.out.println(p1.y);   //-> Here it will Through error while printing Child Class and loose the access of child
//        p1.fun1();
//        p1.fun2();    //  Here it will Through error while printing Child Class

//    DownCasting
    }

}

class Animal1{
    Boolean isExtinct = false;

    void eat(){
        System.out.println(" Animal is eating food");
    }}
class Bird extends Animal1{
    int wingSpan;

    void fly(){
        System.out.println("The Bird is flying");
    }
}
//class parent{
//    int x =8;
//    void fun1(){
//        System.out.println("Fun1 << ");
//    }
//}
//class child extends parent{
//    int y =10;
//    void fun2(){
//        System.out.println("Fun2 <<");
//    }
//}