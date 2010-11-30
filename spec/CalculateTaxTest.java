import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;



public class CalculateTaxTest {
	@Test
	public void itShouldCalculateFederalTax() {
		assertThat(CalculateTax.federalTax(100), is(equalTo(25D)));
	}
	
	@Test
	public void itShouldCalculateFederalTax2() {
		assertThat(CalculateTax.federalTax(200), is(equalTo(50D)));
	}
}
