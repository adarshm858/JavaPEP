package Encapsulations;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        student st1 = new student(3, "John");
//      System.out.println(st1.name);
//      System.out.println(st1.roll);

//      st1.name = "Donkey";
//      System.out.println(st1.name);
//      System.out.println(st1.roll);
        System.out.println(st1.getName());
        System.out.println(st1.getRoll());
        System.out.println(st1.info());

//    st1=roll=99;
        st1.setRoll(99);

        System.out.println(st1.info());
    }

//    Employee emp1=new Employee("john",1,"LPU Infotech",true,300000,9033739223);
//    System.out.println()emp1.info());
//Employee emp2 =new Employee();
//emp2.setEmpId(43).setCompanyName("Google").setphoneNumber(903373922);
//System.out.println(emp2.get)
//
//
//
// }
//car c1 = new car("TOYOTA","KA 6888",5.6f);
//    System.out.println(c1.getName);

}