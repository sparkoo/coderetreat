package cz.sparko.coderetreat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        log.debug("App is starting ...");
    }

    public boolean testMethod() {
        log.trace("test method");
        return true;
    }
}
