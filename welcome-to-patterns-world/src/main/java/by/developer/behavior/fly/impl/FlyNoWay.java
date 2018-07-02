package by.developer.behavior.fly.impl;

import by.developer.behavior.fly.FlyBehaviour;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FlyNoWay implements FlyBehaviour {

    private static final Logger log = LogManager.getLogger(FlyNoWay.class);

    @Override
    public void fly() {
        log.info("I can't fly ...");
    }
}
