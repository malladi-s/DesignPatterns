package com.surya.designpatterns;

import memento.Caretaker;
import memento.Originator;

public class Main {
    public static void main(String[] args) {
        mementoPattern();
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
