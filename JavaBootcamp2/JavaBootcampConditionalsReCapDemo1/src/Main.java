
public class Main {

	public static void main(String[] args) {
		
		int number1 = 20;
		int number2 = 25;
		int number3 = 2333;
		
		if(number1>number2 && number1>number3) {
			System.out.println("number 1 : " + number1 + " is greater than number2 : " + number2 +" and number3 : " + number3);
		}else if(number2>number1 && number2>number3) {
			System.out.println("number 2 : " + number2 + " is greater than number1 : " + number1 + " and number3 : " + number3);
		}else {
			System.out.println("number 3 : " + number3 + " is greater than number1 : " + number1 + " and number 2 : " + number2);
		}

	}

}
