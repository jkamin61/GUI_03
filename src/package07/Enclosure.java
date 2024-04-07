package package07;

import java.util.ArrayList;

public class Enclosure<T extends AAnimal>{
    ArrayList<AAnimal> listOfAnimals = new ArrayList<>();
    public void addAnimalToEnclosure(T animal){
        listOfAnimals.add(animal);
    }
    public ArrayList<AAnimal> getEnclosure(){
        return listOfAnimals;
    }
}
