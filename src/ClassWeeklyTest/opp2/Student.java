package ClassWeeklyTest.opp2;

public class Student {



        String name;
        double marksObtained;

        static String collegeName = "LPU";
        static final double MAX_MARKS = 100;

        public Student(String name, double marksObtained) {
            this.name = name;
            this.marksObtained = marksObtained;
        }

   // @Override
    public String info() {
        return "Student{" +
                "marksObtained=" + marksObtained +
                ", name='" + name + '\'' +
                '}';
    }

    public void printPercentage() {
            double percentage = (marksObtained / MAX_MARKS) * 100;
        System.out.println(name+""+percentage);
        }



        }






