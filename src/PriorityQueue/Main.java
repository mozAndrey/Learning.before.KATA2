package PriorityQueue;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("Andrey", "Mozal", 4, 5.2, 6.2, 7.8);
        Student st2 = new Student("Ekaterina", "Mozal", 3, 4.2, 5.4, 6.7);
        Student st3 = new Student("Petr", "Ezhov", 2, 4.2, 6.5, 2.6);
        Student st4 = new Student("Dedok", "Nesterov", 1, 3.2, 6.5, 7.6);
        Student st5 = new Student("Kolya", "Nesterov");
        Student st6 = new Student("Petya", "Peskov");
        List<Student> arrayListOfStudents = new ArrayList<>();
        arrayListOfStudents.add(st1);
        arrayListOfStudents.add(st2);
        arrayListOfStudents.add(st3);
        arrayListOfStudents.add(st4);
        Collections.sort(arrayListOfStudents, new AverageGradeComparator());
        System.out.println(arrayListOfStudents);

    }
}
