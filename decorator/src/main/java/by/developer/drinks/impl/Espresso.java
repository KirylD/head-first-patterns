package by.developer.drinks.impl;

import by.developer.drinks.Beverage;

/**
 * @author kiryl.drabysheuski
 * @since 02.08.2018
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public float coast() {
        return 5;
    }
}
