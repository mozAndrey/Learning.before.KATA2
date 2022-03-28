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
//        System.out.println(list);
        List<Student> listOfAvgGradeUp6 = list.stream().filter(e->
                e.getAverageGrade()>6).collect(Collectors.toList());
        System.out.println("Оценки больше шести: " + listOfAvgGradeUp6);

        List<Student> listOfAvgGradesDown6 = list.stream().filter(e->
                e.getAverageGrade()<6).collect(Collectors.toList());
        System.out.println("Оценки меньше шести: " + listOfAvgGradesDown6);

        List<String> listOfNames = list.stream().map(e->e.getName()).collect(Collectors.toList());
        System.out.println("Имена: " + listOfNames);

        List<String> listOfSurnames = list.stream().map(e->e.getSurname()).collect(Collectors.toList());
        System.out.println("Фамилии: " + listOfSurnames);

        System.out.println("Решение деканата:");
        list.stream().forEach(student -> {if (student.getAverageGrade() < 6){
            System.out.println(student.getName() + " " + student.getSurname() + " На отчисление");
        }
        else System.out.println(student.getName() + " " + student.getSurname() + " Молодец");});

        List<Double> listOfGrades = list.stream().map(e->e.getAverageGrade()).collect(Collectors.toList());
        System.out.println("Список оценок: " + listOfGrades);
        double avgGradeOfAllStudents = listOfGrades.stream().reduce((a,e) -> (a+e) / (listOfGrades.size()*1.0)).get();
        System.out.println(avgGradeOfAllStudents);
        String designOfMentors = (avgGradeOfAllStudents < 6) ? "Отчисляйте всех нахрен" : "Пусть живут";
        System.out.println(designOfMentors);
        }
    }

