public class SmartStrategy implements OrderingStrategy {
    private StringOrder order;

    public SmartStrategy() {
    }

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour()) {
            bar.order(drink, recipe);
        } else {
            this.order = new StringOrder(bar, recipe, drink);
        }

    }

    public void happyHourStarted(StringBar bar) {
        if (this.order != null && this.order.bar.equals(bar)) {
            bar.order(this.order.drink, this.order.recipe);
        }

    }

    public void happyHourEnded(StringBar bar) {
    }

    static class StringOrder {
        private final StringBar bar;
        private final StringRecipe recipe;
        private final StringDrink drink;

        public StringOrder(StringBar bar, StringRecipe recipe, StringDrink drink) {
            this.bar = bar;
            this.recipe = recipe;
            this.drink = drink;
        }
    }
}



