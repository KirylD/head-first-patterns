package by.developer.run;

import by.developer.behavior.fly.impl.FlyRocketPowered;
import by.developer.duck.Duck;
import by.developer.duck.MallardDuck;
import by.developer.duck.ModelDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
