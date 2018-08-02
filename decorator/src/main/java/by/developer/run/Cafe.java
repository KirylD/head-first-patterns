package by.developer.run;

import by.developer.condiments.impl.Milk;
import by.developer.condiments.impl.Soy;
import by.developer.drinks.Beverage;
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
        Espresso espressoMini = new Espresso(Beverage.Size.MINI);
        log.info(espressoMini.getDescription() + " " + espressoMini.getSize() + " " + espressoMini.coast());

        Milk espressoMiniWithMilk = new Milk(espressoMini);
        log.info(espressoMiniWithMilk.getDescription() + " " + espressoMiniWithMilk.getSize() + " " + espressoMiniWithMilk.coast());

        Espresso espressoMax = new Espresso(Beverage.Size.MAX);
        log.info(espressoMax.getDescription() + " " + espressoMax.getSize() + " " + espressoMax.coast());

        Milk espressoMaxWithMilk = new Milk(espressoMax);
        log.info(espressoMaxWithMilk.getDescription() + " " + espressoMaxWithMilk.getSize() + " " + espressoMaxWithMilk.coast());


        Soy espressoMaxWithMilkAndSoy = new Soy(espressoMaxWithMilk);
        log.info(espressoMaxWithMilkAndSoy.getDescription() + " " + espressoMaxWithMilkAndSoy.getSize() + " " + espressoMaxWithMilkAndSoy.coast());
    }
}
