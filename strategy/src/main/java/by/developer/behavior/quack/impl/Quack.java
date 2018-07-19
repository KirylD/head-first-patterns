package by.developer.behavior.quack.impl;

import by.developer.behavior.quack.QuackBehaviour;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Quack implements QuackBehaviour {

    private static final Logger log = LogManager.getLogger(Quack.class);

    @Override
    public void quack() {
        log.info("Quack");
    }
}
