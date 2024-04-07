package package08;

import java.util.ArrayList;
import java.util.Random;

public class Candy implements Comparable<Candy> {

    int uniqueID;
    String taste;
    double weight;
    ArrayList<String> food = new ArrayList<>();

    public Candy() {
        Random random = new Random();
        this.uniqueID = random.nextInt(Integer.MAX_VALUE);
        this.weight = random.nextInt((int)(10 * 1000)) / 1000.0;
        this.taste = generateTaste();
    }

    public String generateTaste() {
        Random random = new Random();
        food.add("Sour");
        food.add("Sweet");
        food.add("Bitter");
        food.add("Supersweet");
        int index = random.nextInt(food.size());
        return food.get(index);
    }

    public static ArrayList<Candy> generateRandomCandies(int amount) {
        ArrayList<Candy> candies = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            candies.add(new Candy());
        }
        return candies;
    }

    public static ArrayList<Candy> removeCandyTaste(String taste, ArrayList<Candy> candies) {
        for (int i = 0; i < candies.size(); i++) {
            if (candies.get(i).taste.equals(taste)) {
                candies.remove(i);
            }
        }
        return candies;
    }

    @Override
    public int compareTo(Candy candy) {
        if (this.weight > candy.weight) {
            return 1;
        } else if (this.weight < candy.weight) {
            return -1;
        } else {
            return Integer.compare(this.uniqueID, candy.uniqueID);
        }
    }

    public static ArrayList<Candy> sortCandies(ArrayList<Candy> candies) {
        candies.sort(Candy::compareTo);
        return candies;
    }

    public static ArrayList<Candy> sortCandiesWithLambda(ArrayList<Candy> candies) {
        candies.sort((candy1, candy2) -> {
            if (candy1.weight > candy2.weight) {
                return 1;
            } else if (candy1.weight < candy2.weight) {
                return -1;
            } else {
                return Integer.compare(candy1.uniqueID, candy2.uniqueID);
            }
        });
        return candies;
    }

    public static ArrayList<Candy> removeDuplicates(ArrayList<Candy> candies) {
        ArrayList<Candy> uniqueCandies = new ArrayList<>();
        for (Candy candy : candies) {
            if (!uniqueCandies.contains(candy)) {
                uniqueCandies.add(candy);
            }
        }
        return uniqueCandies;
    }
    public static ArrayList<Candy> getDuplicates(ArrayList<Candy> candies) {
        ArrayList<Candy> uniqueCandies = new ArrayList<>();
        ArrayList<Candy> duplicates = new ArrayList<>();
        for (Candy candy : candies) {
            if (!uniqueCandies.contains(candy)) {
                uniqueCandies.add(candy);
            } else {
                duplicates.add(candy);
            }
        }
        return duplicates;
    }
    public static int sumOfCandies(ArrayList<Candy> candies) {
        int sum = 0;
        for (Candy candy : candies) {
            sum += candy.weight;
        }
        return sum;
    }
    public static ArrayList<Candy> concatTwoSets(ArrayList<Candy> candies1, ArrayList<Candy> candies2) {
        ArrayList<Candy> allCandies = new ArrayList<>();
        allCandies.addAll(candies1);
        allCandies.addAll(candies2);
        return allCandies;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "uniqueID=" + uniqueID +
                ", taste='" + taste + '\'' +
                ", weight=" + weight +
                ", food=" + food +
                '}';
    }
}

