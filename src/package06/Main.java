package package06;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> setOfPeople = new HashMap<>();
        Person kowalski = new Person("Jan", "Kowalski");
        setOfPeople.put(kowalski.name, kowalski.surname);
        Person nowak = new Person("Adam", "Nowak");
        setOfPeople.put(nowak.name, nowak.surname);
        Person krawczyk = new Person("Bartosz", "Krawczyk");
        setOfPeople.put(krawczyk.name, krawczyk.surname);
        Person heniek = new Person("Kierownik", "Heniek");
        setOfPeople.put(heniek.name, heniek.surname);
        System.out.println(setOfPeople);

        HashMap<String, String> setOfCars = new HashMap<>();
        Car skoda1 = new Car("WA00001", "Skoda");
        setOfCars.put(skoda1.brand, skoda1.RegistrationNumber);
        Car skoda2 = new Car("SC36010", "Skoda");
        setOfCars.put(skoda2.brand, skoda2.RegistrationNumber);
        Car mazda1 = new Car("WA01234", "Mazda");
        setOfCars.put(mazda1.brand, mazda1.RegistrationNumber);
        Car mazda2 = new Car("DW01ASD", "Mazda");
        setOfCars.put(mazda2.brand, mazda2.RegistrationNumber);
        Car bmw = new Car("WA12690", "BMW");
        setOfCars.put(bmw.brand, bmw.RegistrationNumber);
        Car volvo = new Car("KR60606", "Volvo");
        setOfCars.put(volvo.brand, volvo.RegistrationNumber);
        System.out.println(setOfCars);

        kowalski.addCar(skoda1);
        kowalski.addCar(bmw);
        nowak.addCar(mazda1);
        krawczyk.addCar(volvo);

        System.out.println("Kowalski ma auta: " + kowalski.getCars());
        System.out.println("Nowak ma auta: " + nowak.getCars());
        System.out.println("Krawczyk ma auta: " + krawczyk.getCars());
        System.out.println("Heniek ma auta: " + heniek.getCars());

        System.out.println("Samochody, ktore maja na poczatku rejestracji WA");
            for (String key : setOfCars.keySet()) {
            if (key.startsWith("WA")) {
                System.out.println(key + " " + setOfCars.get(key));
            }
        }
        System.out.println("Samochody nowaka:"+nowak.getCars().get(0));
    }
}
