package PriorityQueue;


import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    final String name;
    final String surname;
    int course;
    double gradeOfMath;
    double gradeOfHistory;
    double gradeOfPhysics;
    double averageGrade;

    @Override
    public String toString() {
        return "Студент: " +
                "Имя: " + name + '\n' +
                "Фамилия: " + surname + '\n' +
                "Курс обучения : " + course + '\n' +
                "Средняя оценка: " + averageGrade + '\n';
    }


    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        averageGrade = (gradeOfHistory / 3) + (gradeOfMath / 3) + (gradeOfPhysics / 3);
        handlingExceptions();

    }

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        averageGrade = (gradeOfHistory / 3) + (gradeOfMath / 3) + (gradeOfPhysics / 3);
        handlingExceptions();
    }

    public Student(String name, String surname, int course, double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.averageGrade = (gradeOfHistory / 3) + (gradeOfMath / 3) + (gradeOfPhysics / 3);
        this.averageGrade = averageGrade;
        handlingExceptions();
    }

    public Student(String name, String surname, int course, double gradeOfPhysics, double gradeOfMath, double gradeOfHistory) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.gradeOfPhysics = gradeOfPhysics;
        this.gradeOfHistory = gradeOfHistory;
        this.gradeOfMath = gradeOfMath;
        averageGrade = (this.gradeOfHistory / 3) + (this.gradeOfMath / 3) + (this.gradeOfPhysics / 3);
        handlingExceptions();

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public int compareTo(Student o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.surname.compareTo(o.surname);
        }
        return result;
    }

    void handlingExceptions() {
        if (course > 4 || course < 1) {
            try {
                throw new Exception("Курс должен быть от 1 до 4");
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
        if (name.contains("!") || name.contains("?") || name.contains(" ") || name.contains("&") || name.contains("@") ||
                name.contains("#") || name.contains("$") || name.contains("%") || name.contains("^") || name.contains("*") ||
                name.contains("(") || name.contains(")")) {
            try {
                throw new Exception("Имя должно содержать только буквы");
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
        if (surname.contains("!") || surname.contains("?") || surname.contains(" ") || surname.contains("&") ||
                surname.contains("@") || surname.contains("#") || surname.contains("$") || surname.contains("%") ||
                surname.contains("^") || surname.contains("*") || surname.contains("(") || surname.contains(")")) {
            try {
                throw new Exception("Имя должно содержать только буквы");
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
        if (gradeOfPhysics < 0 || gradeOfMath < 0 || gradeOfHistory < 0) {
            try {
                throw  new Exception("Оценка не может быть отрицательной");
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }

}

class CourseComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.course - o2.course;
    }
}

class GradeOfMathComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int) ((int) o1.gradeOfMath - o2.gradeOfMath);
    }
}

class GradeOfHistoryComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int) ((int) o1.gradeOfHistory - o2.gradeOfHistory);
    }
}

class GradeOfPhysicsComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int) ((int) o1.gradeOfPhysics - o2.gradeOfPhysics);
    }
}

class AverageGradeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.averageGrade - o2.averageGrade);
    }
}

