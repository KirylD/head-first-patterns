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
        float condimentCost;

        Size size = getBeverage().getSize();
        if (size.getMl() == Size.MINI.getMl()) {
            condimentCost = 1;
        } else if (size.getMl() == Size.MIDDLE.getMl()) {
            condimentCost = 2;
        } else if (size.getMl() == Size.MAX.getMl()) {
            condimentCost = 3;
        } else {
            throw new UnsupportedOperationException("Unsupported Size.");
        }

        return getBeverage().coast() + condimentCost;
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Milk";
    }
}
