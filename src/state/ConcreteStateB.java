package state;

public class ConcreteStateB implements State {
    @Override
    public void handle() {
        System.out.println("Handled B");
    }
}
