package package06;

import java.util.HashMap;

public class Car {
    String brand, RegistrationNumber;


    public Car(String brand, String registrationNumber) {
        this.brand = brand;
        RegistrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", RegistrationNumber='" + RegistrationNumber + '\'' +
                '}';
    }
}
