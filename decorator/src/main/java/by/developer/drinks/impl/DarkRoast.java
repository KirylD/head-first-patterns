package by.developer.drinks.impl;

import by.developer.drinks.Beverage;

/**
 * @author kiryl.drabysheuski
 * @since 02.08.2018
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public float coast() {
        return 10f;
    }
}
