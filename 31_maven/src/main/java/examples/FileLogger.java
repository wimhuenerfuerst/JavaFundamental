package examples;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileLogger implements LoggerInterface {

	@Override
	public void print(String text) {
		try {
			Files.write(new File("log.txt").toPath(), text.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
