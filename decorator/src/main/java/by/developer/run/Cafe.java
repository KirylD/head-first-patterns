package by.developer.run;

import by.developer.condiments.impl.Milk;
import by.developer.condiments.impl.Soy;
import by.developer.drinks.impl.Espresso;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author kiryl.drabysheuski
 * @since 02.08.2018
 */
public class Cafe {

    private static final Logger log = LogManager.getLogger(Cafe.class);

    public static void main(String[] args) {
        Espresso espresso = new Espresso();

        Milk espressoWithMilk = new Milk(espresso);
        log.info(espressoWithMilk.getDescription() + " costs " + espressoWithMilk.coast());

        Soy espressoWithMilkAndSoy = new Soy(espressoWithMilk);
        log.info(espressoWithMilkAndSoy.getDescription() + " costs " + espressoWithMilkAndSoy.coast());
    }
}
