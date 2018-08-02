package by.developer.condiments.impl;

import by.developer.condiments.CondimentDecorator;
import by.developer.drinks.Beverage;

/**
 * @author kiryl.drabysheuski
 * @since 02.08.2018
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverageToDecorate) {
        super(beverageToDecorate);
    }

    @Override
    public float coast() {
        return getBeverage().coast() + 1f;
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Milk";
    }
}
