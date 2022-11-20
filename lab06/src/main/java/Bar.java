import java.util.Iterator;
import java.util.List;

public abstract class Bar {
    protected List<BarObserver> observers;

    public Bar(List<BarObserver> observers) {
        this.observers = observers;
    }

    abstract public boolean isHappyHour();

    abstract public void startHappyHour();

    abstract public void endHappyHour();


    public void addObserver(BarObserver observer) {
        observers.add(observer);

    }

    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator var = this.observers.iterator();
        while (var.hasNext()) {
            BarObserver observer = (BarObserver) var.next();
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
        }
    }
}
