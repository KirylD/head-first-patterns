package by.developer.behavior.quack.impl;

import by.developer.behavior.quack.QuackBehaviour;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MuteQuack implements QuackBehaviour {

    private static final Logger log = LogManager.getLogger(MuteQuack.class);

    @Override
    public void quack() {
        log.info("<< Silence >>");

    }
}
