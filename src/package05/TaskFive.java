package package05;

import java.util.HashMap;

public class TaskFive {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(31, "January");
        map.put(28, "February");
        map.put(31, "March");
        map.put(30, "April");
        System.out.println("Month with 31 days is " + map.get(31));
    }
}
