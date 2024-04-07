import package01.*;
import package02.*;

public class Main {
    public static void main(String[] args) {
        Container<Integer> integerContainer = new Container<>(5);
        integerContainer.print();
        Container<String> stringContainer = new Container<>("Hello");
        stringContainer.print();
        System.out.println("------------------------------------------");
        ContainerRefactored<Integer, Integer> integerContainerRefactored = new ContainerRefactored<>(5, 10);
        integerContainerRefactored.print();
        ContainerRefactored<String, String> stringContainerRefactored = new ContainerRefactored<>("Hello", "World");
        stringContainerRefactored.print();
    }
}
