
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import cuke4duke.annotation.I18n.EN.Given;
import cuke4duke.annotation.I18n.EN.Then;


public class FederalIncomeTaxSteps {
	
	int grossPay;

	@Given ("^a gross pay of (.*)$")
	public void aGrossPayOf(int grossPay) {
		this.grossPay = grossPay;
	}

	@Then ("^we should have a federal income tax of (.*) dollars$")
	public void weShouldHaveAFederalIncomeTaxOf(double rate) {
		assertThat(CalculateTax.federalTax(grossPay), is(equalTo(rate)));
	}
}
