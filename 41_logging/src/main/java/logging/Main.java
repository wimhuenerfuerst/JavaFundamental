package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import logging.a.MainA;
import logging.b.MainB;
import logging.b.MainB2;

public class Main {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		LOGGER.info("Hallo Welt Main");
		LOGGER.warn("Hallo Welt Main");
		LOGGER.error("Hallo Welt Main");
		
		MainA.main(args);
		MainB.main(args);
		MainB2.main(args);
	}
}
