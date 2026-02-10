package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator; // Added this import

public class CollectionAndList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() {{
            add(34);
            add(31);
            add(90);
            add(67);
        }};

        Collections.sort(list);
        System.out.println("Sorted: " + list);

        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        Collections.shuffle(list);
        System.out.println("Shuffled: " + list);

        ArrayList<Integer> list2 = new ArrayList<>(list);
        System.out.println("List 1: " + list);
        System.out.println("List 2 (Copy): " + list2);

        ArrayList<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student(20, "john"));
        listOfStudents.add(new Student(45, "jake"));
        listOfStudents.add(new Student(30, "alice"));
        listOfStudents.add(new Student(67, "Bob"));

        // Sorts using the Comparable (age) implementation
        Collections.sort(listOfStudents);

        System.out.println("\nStudents sorted by age:");
        listOfStudents.forEach(System.out::println);
    }
}

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(int age, String name) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        // Standard ascending order: current object vs other object
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}

// Fixed: Comparator is used for external sorting logic (by name)
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareToIgnoreCase(s2.name);
    }
}
