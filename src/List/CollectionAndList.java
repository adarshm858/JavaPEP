package List;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionAndList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() {{
            add(34);
            add(31);
            add(90);
            add(67);
        }};
        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(list);
//        Collections.copy(list2,list);

        System.out.println(list);
        System.out.println(list2);

//        list.replaceAll(x-> x*2);
//        System.out.println(list);


        ArrayList<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add( new Student(20,"john"));
        listOfStudents.add( new Student(45,"jake"));
        listOfStudents.add( new Student(30,"alice"));
        listOfStudents.add( new Student(67,"Bob"));
//        Collections.sort(listOfStudents);
    }
}


class Student {
    String name ;
    int age;

    public Student(int age, String name) {

        this.name = name;
        this.age = age;
    }

//    @Override
    public String toString() {
        return  name + " " + age;
    }
}
