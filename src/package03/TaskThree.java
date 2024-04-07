package package03;

import java.util.ArrayList;

public class TaskThree {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ala");
        list.add("ma");
        list.add("kota");
        System.out.println("List size: " + list.size());
        System.out.println("[");
        for (String element : list) {
            System.out.println(element+",");
        }
        System.out.println("]");
    }
}
