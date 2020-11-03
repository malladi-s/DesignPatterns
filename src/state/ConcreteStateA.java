package state;

public class ConcreteStateA implements State {
    @Override
    public void handle() {
        System.out.println("Handled A");
    }
}
