
public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		employee.age = 12;
		customer.age = 12;
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		employeeManager.Add();
		customerManager.Add();
	}

}
