package by.developer.condiments.impl;

import by.developer.condiments.CondimentDecorator;
import by.developer.drinks.Beverage;

/**
 * @author kiryl.drabysheuski
 * @since 02.08.2018
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverageToDecorate) {
        super(beverageToDecorate);
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Soy";
    }

    @Override
    public float coast() {
        return getBeverage().coast() + 0.5f;
    }
}
