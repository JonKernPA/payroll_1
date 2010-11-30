import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;



public class EmployeePaystubTest {

	@Test
	public void itShouldShowChetsFederalTax() {
		Employee employee = new Employee("Chet");
		employee.setHourlyRate(11);
		employee.setHoursWorked(20);
		double basePay = employee.getBasePay();
		assertThat(basePay, is(equalTo(220D)));
		assertThat(CalculateTax.federalTax(basePay), is(equalTo(55D)));
	}

	@Test
	public void itShouldShowRonsFederalTax() {
		Employee employee = new Employee("Ron");
		employee.setHourlyRate(10);
		employee.setHoursWorked(30);
		double basePay = employee.getBasePay();
		assertThat(basePay, is(equalTo(300D)));
		assertThat(CalculateTax.federalTax(basePay), is(equalTo(75D)));
	}
}
