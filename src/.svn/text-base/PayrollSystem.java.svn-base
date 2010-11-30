


public class PayrollSystem {

	public static String[] runPayroll(String[] payrollFile) {
		return createLedgerRecord(payrollFile).toArray();
	}

	private static LedgerRecord createLedgerRecord(String[] payrollFile) {
		LedgerRecord record = new LedgerRecord();
		record.setName(payrollFile[0]);
		record.setHourlyRate(doubleToInt(payrollFile[1]));
		record.setHoursWorked(doubleToInt(payrollFile[2]));
		record.setDestination(payrollFile[4]);
		record.setBankAccount(payrollFile[5]);
		record.setRoutingNumber(payrollFile[6]);
		record.setGrossPay(calculateGrossPay(record.getHoursWorked(), record.getHourlyRate()));
		return record;
	}

	private static int doubleToInt(String value) {
		return new Double(new Double(value) * 100).intValue();
	}

	private static int calculateGrossPay(int hoursWorked, int hourlyRate) {
		return (hoursWorked * hourlyRate)/100;
	}

}
