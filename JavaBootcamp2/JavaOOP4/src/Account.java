
public class Account {
	
	private String accountNo;
	private double balance;
	private String name;
	
	private String email;
	private String phoneNumber;
	
	public Account(String name, String email, String phoneNumber) {
		
		
	}
	
	public Account() {
		
		/*this.accountNo = "No information";
		this.balance = 0.0;
		this.name = "No information";
		this.email = "No information";
		this.phoneNumber = "No information";*/
		
		this("No information", 0.0, "No information", "No information", "No information");
		
		//System.out.println("constructor I wrote...");
		
	}
	public Account(String accountNo, double balance, String name, String email, String phoneNumber) {
		
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
		this.email = email;		
		this.phoneNumber = phoneNumber;
		
		}
	
	public void depositMoney(double quantity) {
		balance += quantity;
		
		System.out.println("New balance : " + balance);
	}
	
	public void withdrawMoney(double quantity) {
		
		if (quantity > 1500) {
			System.out.println("You cannot withdraw more than 1500 TL in a day...");
		}
		if(balance - quantity < 0) {
			System.out.println("insufficient balance. your balance : " + balance);
		}else {
			balance -= quantity;
			System.out.println("New balance : " + balance);
		}
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
