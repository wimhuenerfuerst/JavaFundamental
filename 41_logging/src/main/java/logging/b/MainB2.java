package logging.b;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainB2 {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainB2.class);

	public static void main(String[] args) {
		LOGGER.info("Hallo Welt Main B2");
		LOGGER.debug("Hallo Welt debug Main B2");
	}

}
