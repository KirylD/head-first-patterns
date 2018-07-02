package by.developer.duck;

import by.developer.behavior.fly.impl.FlyWithWings;
import by.developer.behavior.quack.impl.Quack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MallardDuck extends Duck {

    private static final Logger log = LogManager.getLogger(MallardDuck.class);

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        log.info("I'm a real Mallard duck.");
    }
}
