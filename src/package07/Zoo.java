package package07;

import java.util.ArrayList;

public class Zoo {
    public ArrayList<Enclosure> enclosureList = new ArrayList();
    public ArrayList<Worker> workerList = new ArrayList<>();

    public void showAllAnimals() {
        for (Enclosure enclosure : enclosureList) {
            System.out.println(enclosure.getEnclosure());
        }
    }

    public void showAllWorkers() {
        for (Worker worker : workerList) {
            System.out.println(worker);
        }
    }
}
