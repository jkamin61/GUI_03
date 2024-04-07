package package08;

public class Main {
    public static void main(String[] args) {
        Candy candy = new Candy();
        System.out.println(candy);
        System.out.println(
                candy.generateTaste()
        );
        Candy.generateRandomCandies(5).forEach(System.out::println);
        Candy.removeCandyTaste("Sweet", Candy.generateRandomCandies(5)).forEach(System.out::println);
        Candy.sortCandies(Candy.generateRandomCandies(5)).forEach(System.out::println);
        Candy.sortCandiesWithLambda(Candy.generateRandomCandies(5)).forEach(System.out::println);
        Candy.sumOfCandies(candy.generateRandomCandies(5));
        Candy.removeDuplicates(Candy.generateRandomCandies(5)).forEach(System.out::println);
        Candy.removeDuplicates(Candy.generateRandomCandies(5)).forEach(System.out::println);
    }
}
