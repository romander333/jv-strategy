package core.basesyntax.Imple;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class strategyDisc {
    private static final Logger log = LogManager.getLogger(strategyDisc.class);

    public static void main(String[] args) {
        log.info("Starting strategy Disc");
        strategyDisc strategy = new strategyDisc();
    }
}
