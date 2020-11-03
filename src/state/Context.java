package state;

public class Context {
    State currentState = null;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void handle() {
        this.getCurrentState().handle();
    }
}
