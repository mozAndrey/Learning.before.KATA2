package PriorityQueue;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("Andrey", "Mozal", 1, 5.2, 6.2, 7.8);
        Student st2 = new Student("Ekaterina", "Mozal", 3, 4.2, 5.4, 6.7);
        Student st3 = new Student("Petr", "Ezhov", 4, 4.2, 6.5, 2.6);
        Student st4 = new Student("Dedok", "Nesterov", 2, 3.2, 6.5, 7.6);
        Student st5 = new Student("Kolya", "Nesterov");
        Student st6 = new Student("Petya", "Peskov");
        Student st7 = new Student("Masha", "Peskova");
        ArrayList <Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        list.add(st6);
        list.add(st7);
        List<String> listOfNames = Student.getListOfNames(list);
        List<String> listOfSurnames = Student.getListOfSurnames(list);
        List<Double> listOfAvgGrades = Student.getListOfAvgGrades(list);
        Student.getDesignOfMentors(list);
        System.out.println("Names: "+listOfNames);
        System.out.println("Surnames: "+listOfSurnames);
        System.out.println("Grades : "+listOfAvgGrades);
        }
    }

