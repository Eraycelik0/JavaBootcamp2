
public class Test {

	public static void main(String[] args) {
		
		//Account account1 = new Account();
		
		Account account2 = new Account("123456", 1000.0, "Eray Celil", "eray@gmail.com", "3121212");
		
		account2.depositMoney(500);
		
		account2.withdrawMoney(2000);
		
		
	}

}
