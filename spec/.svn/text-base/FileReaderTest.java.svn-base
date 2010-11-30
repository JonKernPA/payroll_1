import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Test;



public class FileReaderTest {
	@Test
	public void itShouldProperlyIdentifyTheFirstElement() throws FileNotFoundException {
		FileReader fileReader = new FileReader("input.txt");
		assertThat(fileReader.contents()[0], is(equalTo("DEF")));
	}

	@Test
	public void itShouldProperlyIdentifyMultipleElements() throws FileNotFoundException {
		FileReader fileReader = new FileReader("input.txt");
		String[] results = fileReader.contents();
		assertThat(results[0], is(equalTo("DEF")));
		assertThat(results[1], is(equalTo("456")));
	}
}
