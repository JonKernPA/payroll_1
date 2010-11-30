import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;



public class EmployeeTest {
	
	private Employee employee;
	
	@Before
	public void before() {
		employee = new Employee("Ron");
	}

	@Test
	public void itShouldKnowItsBasePay() {
		assertThat(basePayForEmployeeWithRateAndHoursOf(10, 40), is(equalTo(400D)));
	}

	@Test
	public void itShouldKnowHowToCalculatePartialWeek() {
		assertThat(basePayForEmployeeWithRateAndHoursOf(11, 20), is(equalTo(220D)));
	}
	
	@Test
	public void itShouldBeAbleToCalculateGrossPayForAPayPeriod() {
		assertThat(grossPayForEmployeeWithRateAndHoursOf(20, 20), is(equalTo(400D)));
	}

	private double grossPayForEmployeeWithRateAndHoursOf(int rate, int hours) {
		setRateAndHoursWorked(rate, hours);
		return employee.getGrossPay();
	}
	
	private double basePayForEmployeeWithRateAndHoursOf(int rate, int hoursWorked) {
		setRateAndHoursWorked(rate, hoursWorked);
		return employee.getBasePay();
	}

	private void setRateAndHoursWorked(int rate, int hoursWorked) {
		employee.setHourlyRate(rate);
		employee.setHoursWorked(hoursWorked);
	}
	
}
