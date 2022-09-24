import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number1, number2, transactions;
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("*******************");
		System.out.println("1 - To Collection");
		System.out.println("2 - Extraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - divide");
		
		System.out.print("Enter the firts number : ");
		number1 = scanf.nextInt();
		
		System.out.print("Enter the second number : ");
		number2 = scanf.nextInt();
		
		System.out.print("select a transaction : ");
		transactions = scanf.nextInt();
			
		if(transactions == 1 ) {
			System.out.println("The result of the addition operation : " + (number1+number2));
		}else if (transactions == 2) {
			System.out.println("result of subtraction : " + (number1-number2));
		}else if (transactions == 3) {
			System.out.println("result of multiplication : " + (number1*number2));
		}else if (transactions == 4){
			System.out.println("result of division : " + (number1/number2));
		}else {
			System.out.println("invalid transaction");
		}
		
	}

}
