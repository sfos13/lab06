import java.util.ArrayList;
import java.util.List;

public class StringBar extends Bar {
    boolean bar;

    public StringBar() {
        this(new ArrayList());
    }

    public StringBar(List<BarObserver> observers) {
        super(observers);
        this.bar = false;
    }

    public boolean isHappyHour() {
        return bar;
    }

    public void startHappyHour() {
        this.bar=true;
        this.notifyObservers();
    }
    public void endHappyHour() {
        this.bar=false;
        this.notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }
}
