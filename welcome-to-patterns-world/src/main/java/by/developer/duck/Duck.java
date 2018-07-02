package by.developer.duck;

import by.developer.behavior.fly.FlyBehaviour;
import by.developer.behavior.quack.QuackBehaviour;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author kiryl.drabysheuski
 */
public abstract class Duck {

    private static final Logger log = LogManager.getLogger(Duck.class);

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {}

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        log.info("All ducks float, even decoys");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
