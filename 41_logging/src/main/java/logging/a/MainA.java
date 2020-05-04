package logging.a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainA {

	private static final Logger LOGGER = LoggerFactory.getLogger(MainA.class);

	public static void main(String[] args) {
		LOGGER.info("Hallo Welt Main A");
	}

}
