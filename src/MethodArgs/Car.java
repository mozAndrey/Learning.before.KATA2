package MethodArgs;

import java.util.Objects;

public class Car {
    String color;
    int countOfDoors;

    public Car(String color, int countOfDoors) {
        this.color = color;
        this.countOfDoors = countOfDoors;
    }

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCountOfDoors() {
        return countOfDoors;
    }

    public void setCountOfDoors(int countOfDoors) {
        this.countOfDoors = countOfDoors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return countOfDoors == car.countOfDoors && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, countOfDoors);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", countOfDoors=" + countOfDoors +
                '}';
    }
}
