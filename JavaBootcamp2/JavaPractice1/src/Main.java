import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String password = "12345";
		Scanner scanf = new Scanner(System.in);
		System.out.print("Enter your password : ");
		String enterPassword = scanf.nextLine();
		
		if (enterPassword.equals(password)) {
			System.out.println("Your passw1ord is correct");
		}else {
			System.out.println("Your password is not correct");
		}
		
		
	}
}
