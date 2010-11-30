import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileReader {
	private File inputFile;
	private String[] elements;
	private int counter = 0;

	public FileReader(String inputFile) {
		this.inputFile = new File("/Users/pablosan/workspaces/temp/AwesomeO/spec/" + inputFile);
	}

	public String[] contents() throws FileNotFoundException {
		Scanner scanner = new Scanner(inputFile);
		try {
			while (scanner.hasNextLine()) {
				processLine(scanner.nextLine());
			}
		}
		finally {
			scanner.close();
		}
		
		return elements;
	}

	private void processLine(String nextLine) {
		elements = nextLine.split("\\|");
	}

}
