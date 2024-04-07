package package07;

public class Worker {
    String name;
    public void cleanAnimal(AAnimal animal) {
        System.out.println("Cleaning "+animal);
    };
    public void feedAnimal(AAnimal animal) {
        System.out.println("Feeding "+animal);
    };

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                '}';
    }
}
