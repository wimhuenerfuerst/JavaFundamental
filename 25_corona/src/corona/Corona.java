package corona;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class Corona {

	public static void main(String[] args) throws IOException {
		//String[] lines = Files.readAllLines(new File("input.txt").toPath(), Charset.defaultCharset()).stream().toArray(x -> new String[x]);
		
		List<String> lines = Files.readAllLines(new File("/home/training/Downloads/corona.csv").toPath(), Charset.defaultCharset());
		String[] linesArray = lines.toArray(new String[lines.size()]);
		
		for (String string : linesArray) {
			System.out.println(string);
		}
		
		System.out.println(linesArray.length);
	}

}
