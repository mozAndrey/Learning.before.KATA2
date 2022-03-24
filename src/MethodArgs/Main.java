package MethodArgs;

import java.util.*;

public class Main {
    public Main() {
    }


    public static void main(String[] args) {
        Car c1 = new Car("Red",4 );
        Car c2 = new Car("Pink", 18);
        Car c3 = new Car("Green",20);
        Car c4 = new Car("Red", 4);
        ArrayList<Car> arrOfCars = new ArrayList<>();
        arrOfCars.add(c1);
        arrOfCars.add(c2);
        arrOfCars.add(c3);
        ArrayList<Integer> arrOfInts = new ArrayList<>();
        for (int i = 0; i < arrOfCars.size(); i++) {
            arrOfInts.add(i);
        }
        Map<Car,Integer> mapOfCars = new HashMap<>();
        for (int i = 0; i < arrOfCars.size(); i++) {
            mapOfCars.put(arrOfCars.get(i), arrOfInts.get(i));
        }
        boolean isContains = mapOfCars.containsKey(c4);
        System.out.println("Map contains c4 before editing = " + isContains);
        c4.setColor("Yellow");
        c4.setCountOfDoors(6);
        System.out.println("Map contains c4 after editing = " + mapOfCars.containsKey(c4));
        c2.setColor("Yellow");
        c2.setCountOfDoors(6);

        System.out.println("Hash c2 & c4 = " + (c2.hashCode() == c4.hashCode()));
        System.out.println("Equals c2 & c4 = " + c2.equals(c4));
        System.out.println("Map contains c4 after editing c2 = " + mapOfCars.containsKey(c4));


    }
}
