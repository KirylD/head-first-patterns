package by.developer.drinks.impl;

import by.developer.drinks.Beverage;

/**
 * @author kiryl.drabysheuski
 * @since 02.08.2018
 */
public class Espresso extends Beverage {

    public Espresso(Size size) {
        description = "Espresso";
        this.size = size;
    }

    @Override
    public float coast() {
        if (size.getMl() == Size.MINI.getMl()) {
            return 5;
        } else if (size.getMl() == Size.MIDDLE.getMl()) {
            return 6;
        } else if (size.getMl() == Size.MAX.getMl()) {
            return 7;
        }

        throw new UnsupportedOperationException("Unsupported Size.");
    }
}
