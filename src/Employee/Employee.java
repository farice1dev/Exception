package Employee;

public class Employee {
	private String name;
	private int age;
	private int id;
	private int salary;
	private String role;
	private boolean isMale;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, int age, int id, int salary, String role, boolean isMale) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.salary = salary;
		this.role = role;
		this.isMale = isMale;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", id=" + id + ", salary=" + salary + ", role=" + role
				+ ", isMale=" + isMale + "]";
	}


	

}
