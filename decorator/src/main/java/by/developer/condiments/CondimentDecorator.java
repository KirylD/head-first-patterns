package by.developer.condiments;

import by.developer.drinks.Beverage;

/**
 * @author kiryl.drabysheuski
 * @since 02.08.2018
 */
public abstract class CondimentDecorator extends Beverage {

    private Beverage beverage;

    public CondimentDecorator(Beverage beverageToDecorate) {
        this.beverage = beverageToDecorate;
    }

    @Override
    public abstract String getDescription();

    protected Beverage getBeverage() {
        return beverage;
    }
}
