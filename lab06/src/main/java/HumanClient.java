public class HumanClient implements Client{
    private OrderingStrategy strategy;
    public HumanClient(SmartStrategy strategy) {
        this.strategy = strategy;
    }

    public HumanClient(ImpatientStrategy strategy) {
    }

    public void happyHourStarted(Bar bar) {
        if (bar instanceof StringBar) {
            this.strategy.happyHourStarted((StringBar)bar);
        }

    }

    public void happyHourEnded(Bar bar) {
        if (bar instanceof StringBar) {
            this.strategy.happyHourStarted((StringBar)bar);
        }

    }

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        this.strategy.wants(drink, recipe, bar);
    }
}
