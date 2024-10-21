import java.util.ArrayList;
import java.util.List;
interface Observer {
    void update(String message);
}
class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;
    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }
    public String getState() {
        return state;
    }
    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
class ConcreteObserver1 implements Observer {
    public void update(String message) {
        System.out.println("Observer 1 received update: " + message);
    }
}
class ConcreteObserver2 implements Observer {
    public void update(String message) {
        System.out.println("Observer 2 received update: " + message);
    }
}
