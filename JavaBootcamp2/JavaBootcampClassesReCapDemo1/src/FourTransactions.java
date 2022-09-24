
public class FourTransactions {
	public int Collection(int number1, int number2) {
		int total = number1 + number2;
		System.out.println(total);
		return total;
	}
	public Integer Extractions(int number1, int number2) {
		int result = number1 - number2;
		System.out.println(result);
		return result;
	}
	public Integer Multiplication(int number1, int number2) {
		int result = number1*number2;
		System.out.println(result);
		return result;
	}
	public Integer Multiplication(int... numbers) {
		int multiplication = 1;
		for(int number : numbers) {
			multiplication *= number;
		}
		System.out.println("Result : " + multiplication);
		return multiplication;
	}
	public Integer Division(int number1, int number2) {
		int result = number1/number2;
		if(number2==0) {
			System.out.println("Number 2 cannot be '0' ");
			return number2;
		}else {
			System.out.println("Division result : " + result);
			return result;
		}
		
	}
}
