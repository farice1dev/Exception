package Customer;

public class Customer {
	private String name;
	private int age;
	private int amountAvailable;
	private Long aadharNumber;
	private boolean isRegularCustomer;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAmountAvailable() {
		return amountAvailable;
	}
	public void setAmountAvailable(int amountAvailable) {
		this.amountAvailable = amountAvailable;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public boolean isRegularCustomer() {
		return isRegularCustomer;
	}
	public void setRegularCustomer(boolean isRegularCustomer) {
		this.isRegularCustomer = isRegularCustomer;
	}
	public Customer(String name, int age, int amountAvailable, long aadharNumber, boolean isRegularCustomer) {
		super();
		this.name = name;
		this.age = age;
		this.amountAvailable = amountAvailable;
		this.aadharNumber = aadharNumber;
		this.isRegularCustomer = isRegularCustomer;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", amountAvailable=" + amountAvailable + ", aadharNumber="
				+ aadharNumber + ", isRegularCustomer=" + isRegularCustomer + "]";
	}
	
	
}
