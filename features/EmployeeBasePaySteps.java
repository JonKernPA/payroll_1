
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import cuke4duke.annotation.I18n.EN.Given;
import cuke4duke.annotation.I18n.EN.When;
import cuke4duke.annotation.I18n.EN.Then;
import cuke4duke.annotation.I18n.EN.And;

public class EmployeeBasePaySteps  {
	Employee employee;

	@Given("^an employee named (.*)$")
	public void givenAnEmployee(String name) {
		employee = new Employee(name);
	}
	
	@And("^an hourly rate of (.*) dollars$")
	public void anHourlyRate(double hourlyRate) {
		employee.setHourlyRate(hourlyRate);
	}
	
	@When("^he works (.*) hours$")
	public void hoursWorked(double hours) {
		employee.setHoursWorked(hours);
	}
	
	@Then("^his base pay should be (.*) dollars$")
	public void validatePay(double totalPay) {
		assertThat(employee.getBasePay(), is(equalTo(totalPay)));
	}
	
	@Then ("^his gross pay should be (.*) dollars$")
	public void hisGrossPayShouldBe(double grossPay) {
		assertEquals(grossPay, employee.getGrossPay(), 0.005);
	}

}


