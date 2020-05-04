package logging.b;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainB {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainB.class);

	public static void main(String[] args) {
		LOGGER.info("Hallo Welt Main B");
		LOGGER.debug("Hallo Welt debug Main B");
	}

}
