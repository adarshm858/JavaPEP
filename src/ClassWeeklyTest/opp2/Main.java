package ClassWeeklyTest.opp2;


import static ClassWeeklyTest.opp2.Student.MAX_MARKS;
import static ClassWeeklyTest.opp2.Student.collegeName;

public class Main {
    public static class PercentageCalculation {
        public static void main(String[] args) {
            ClassWeeklyTest.opp2.Student s1 = new ClassWeeklyTest.opp2.Student("Abhishek", 98);
            ClassWeeklyTest.opp2.Student s2 = new ClassWeeklyTest.opp2.Student("Vibha", 65);
            s1.printPercentage();
            s2.printPercentage();
            System.out.println(s1.info());
            System.out.println(s2.info());
            System.out.println("College name for all students : " + collegeName);
            System.out.println("Maximum Marks : " + MAX_MARKS);
        }
    }
}



