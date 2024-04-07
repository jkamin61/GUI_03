package package01;

public class Container<T> {
    T value;

    public Container(T value) {
        this.value = value;
    }
    public void print() {
        System.out.println("Value: "+value);
    }
}
