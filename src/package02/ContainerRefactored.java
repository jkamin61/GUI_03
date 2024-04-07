package package02;

public class ContainerRefactored<T, S> {
    T tValue;
    S sValue;

    public ContainerRefactored(T tValue, S sValue) {
        this.tValue = tValue;
        this.sValue = sValue;
    }
    public void print() {
        System.out.println("First value: "+tValue+", Second value: "+sValue);
    }
}
