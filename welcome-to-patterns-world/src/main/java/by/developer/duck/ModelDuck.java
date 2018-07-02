package by.developer.duck;

import by.developer.behavior.fly.impl.FlyNoWay;
import by.developer.behavior.quack.impl.Quack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModelDuck extends Duck {

    private static final Logger log = LogManager.getLogger(ModelDuck.class);

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        log.info("I'm a model Duck.");
    }
}
