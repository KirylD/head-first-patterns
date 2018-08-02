package by.developer.drinks.impl;

import by.developer.drinks.Beverage;

/**
 * @author kiryl.drabysheuski
 * @since 02.08.2018
 */
public class DarkRoast extends Beverage {

    public DarkRoast(Size size) {
        description = "Dark Roast";
        this.size = size;
    }

    @Override
    public float coast() {
        if (size.getMl() == Size.MINI.getMl()) {
            return 10;
        } else if (size.getMl() == Size.MIDDLE.getMl()) {
            return 11;
        } else if (size.getMl() == Size.MAX.getMl()) {
            return 12;
        }

        throw new UnsupportedOperationException("Unsupported Size.");
    }
}
