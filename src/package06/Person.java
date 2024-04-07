package package06;

import java.util.HashMap;


public class Person {
    String name, surname;
    HashMap<String, String> setOfCars = new HashMap<>();

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString() {
        return name + " " + surname;
    }
    public void addCar(Car car) {
        setOfCars.put(car.brand, car.RegistrationNumber);
    }
    public HashMap<String, String> getCars() {
       return setOfCars;
    }
}
