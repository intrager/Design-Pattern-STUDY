package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public boolean deleteObserver(Observer observer) {
        return observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator<Observer> iter = observers.iterator();
        while(iter.hasNext()) {
            Observer observer = iter.next();
            observer.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}
