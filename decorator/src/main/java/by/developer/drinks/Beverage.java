package by.developer.drinks;

/**
 * @author kiryl.drabysheuski
 * @since 02.08.2018
 */
public abstract class Beverage {

    protected String description;

    protected Size size;

    public String getDescription() {
        return description;
    }

    public abstract float coast();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public enum Size {

        MINI(10),

        MIDDLE(15),

        MAX(20);

        private final int ml;

        Size(int ml) {
            this.ml = ml;
        }

        public int getMl() {
            return ml;
        }
    }
}
