public class Employee {

	private double hourlyRate;
	private double hoursWorked;
	private String payType;
	private String address;
	private int bankAccount;
	private int routingNumber;
	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public void setHoursWorked(double hours) {
		this.hoursWorked = hours;
	}

	public double getHourlyRate() {
		return this.hourlyRate;
	}

	public double getHoursWorked() {
		return this.hoursWorked;
	}

	public double getBasePay() {
		return getHourlyRate() * getHoursWorked();
	}

	public double getGrossPay() {
		return getBasePay();
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}

	public void setRoutingNumber(int routingNumber) {
		this.routingNumber = routingNumber;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getBankAccount() {
		return bankAccount;
	}

	public int getRoutingNumber() {
		return routingNumber;
	}

}
