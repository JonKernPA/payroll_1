
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cuke4duke.annotation.Before;
import cuke4duke.annotation.I18n.EN.Given;
import cuke4duke.annotation.I18n.EN.Then;
import cuke4duke.annotation.I18n.EN.When;

public class CheckOrEftSteps {

	private List<String[]> payrollFile;
	private List<String[]> output;
	
	@Before
	public void before() {
		payrollFile = new ArrayList<String[]>();
		output = new ArrayList<String[]>();
	}

	@Given ("^the following employee data:$")
	public void theFollowingEmployeeDataWithTable(cuke4duke.Table table) {
		 List<Map<String,String>> employeeData = table.hashes();
		 for (Map<String, String> employeeHash : employeeData) {
			payrollFile.add(buildEmployeeFromHash(employeeHash));
		}
	}

	@When ("^payroll is run$")
	public void payrollIsRun() {
		for (String[] payrollRecord : payrollFile) {
			output.add(PayrollSystem.runPayroll(payrollRecord));
		}
	}

	@Then ("^we should have the following output:$")
	public void weShouldHaveTheFollowingOutputWithTable(cuke4duke.Table table) {
		List<Map<String,String>> expectedOutput = table.hashes();
		assertLedger(output.get(0), expectedOutput.get(0));
		assertLedger(output.get(1), expectedOutput.get(1));
	}

	private void assertLedger(String[] ledgerRecord, Map<String, String> map) {
		assertEquals(ledgerRecord[0], map.get("name"));
		assertThat(ledgerRecord[1], is(equalTo(map.get("rate"))));
		assertEquals(ledgerRecord[2], map.get("hours"));
		assertEquals(ledgerRecord[3], map.get("gross"));
		assertEquals(ledgerRecord[4], map.get("destination"));
		if (!map.get("bank").isEmpty())
			assertEquals(ledgerRecord[5], map.get("bank"));
		if (!map.get("routing").isEmpty())
			assertEquals(ledgerRecord[6], map.get("routing"));
	}

	private String[] buildEmployeeFromHash(Map<String, String> employeeHash) {
		List<String> record = new ArrayList<String>();
		record.add(employeeHash.get("name"));
		record.add(employeeHash.get("rate"));
		record.add(employeeHash.get("hours"));
		record.add(employeeHash.get("pay_type"));
		record.add(employeeHash.get("address"));
		record.add(employeeHash.get("bank_account"));
		record.add(employeeHash.get("routing"));
		return record.toArray(new String[record.size()]);
	}

}
