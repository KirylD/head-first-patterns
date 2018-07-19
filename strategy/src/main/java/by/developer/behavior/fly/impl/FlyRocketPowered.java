package by.developer.behavior.fly.impl;

import by.developer.behavior.fly.FlyBehaviour;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FlyRocketPowered implements FlyBehaviour {

    private static final Logger log = LogManager.getLogger(FlyRocketPowered.class);

    @Override
    public void fly() {
        log.info("I'm flying with a rocket!");
    }
}
