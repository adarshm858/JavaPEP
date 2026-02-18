package io;

public class Serializations {
    static void main(String[] args) {
        System.out.println("Invalid Path");
    }
}
class  student extends Serializations {
    transient int age;
    String name;
    private static final long serailVersionUID= 2L;

        public void Student(int age, String name){
            this.age=age;
            this.name=name;
        }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}