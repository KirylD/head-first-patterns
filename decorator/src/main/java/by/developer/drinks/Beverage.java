package by.developer.drinks;

/**
 * @author kiryl.drabysheuski
 * @since 02.08.2018
 */
public abstract class Beverage {

    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract float coast();

}
