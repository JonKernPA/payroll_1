import java.util.ArrayList;
import java.util.List;


public class LedgerRecord {

	private String name;
	private int hourlyRate;
	private int hoursWorked;
	private int grossPay;
	private String destination;
	private String bankAccount;
	private String routingNumber;

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public int getHourlyRate() {
		return this.hourlyRate;
	}

	public int getHoursWorked() {
		return this.hoursWorked;
	}

	public int getGrossPay() {
		return this.grossPay;
	}

	public String getDestination() {
		return this.destination;
	}

	public String getBankAccount() {
		return this.bankAccount;
	}

	public String getRoutingNumber() {
		return this.routingNumber;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public void setGrossPay(int grossPay) {
		this.grossPay = grossPay;
	}

	public void setDestination(String address) {
		this.destination = address;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}

	public String[] toArray() {
		List<String> output = new ArrayList<String>();
		output.add(name);
		output.add(String.format("%.2f", hourlyRate/100D));
		output.add(String.format("%.2f", hoursWorked/100D));
		output.add(String.format("%.2f", grossPay/100D));
		output.add(destination);
		output.add(bankAccount);
		output.add(routingNumber);
		return output.toArray(new String[output.size()]);
	}
}
