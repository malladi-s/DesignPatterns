package com.surya.designpatterns;

import memento.Caretaker;
import memento.Originator;
import state.ConcreteStateA;
import state.ConcreteStateB;
import state.Context;

public class Main {
    public static void main(String[] args) {
        // mementoPattern();
        statePattern();
    }

    private static void statePattern() {
        Context context = new Context();

        context.setCurrentState(new ConcreteStateA());
        context.handle();

        context.setCurrentState(new ConcreteStateB());
        context.handle();
    }

    private static void mementoPattern() {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("Message - 1");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("Message - 2");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("Message - 3");
        caretaker.add(originator.saveStateToMemento());

        System.out.println(caretaker.remove().getState());
        System.out.println(caretaker.remove().getState());
    }
}
