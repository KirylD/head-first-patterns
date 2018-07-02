package by.developer.run;

import by.developer.duck.Duck;
import by.developer.duck.MallardDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.swim();
        mallardDuck.display();

    }
}
