
public class FourTransactions {

	public int collection(int... numbers) {
		int total = 0;
		for(int number : numbers) {
			total += number; 
			
		}
		System.out.println("Collection result : " + total);
		return total;
	}
	
	public int extraction(int... numbers) {
		int total = 0;
		for(int number : numbers) {
			total = number - total; 
			
		}
		System.out.println("Extraction result : " + total);
		return total;
	}
	
	public int multiplication(int... numbers) {
		int total = 1;
		for(int number : numbers) {
			total *= number; 
			
		}
		System.out.println("Multiplication result : " + total);
		return total;
	}
	
	public int division(int number1, int number2) {
		int result = number1 /number2;
		
		if(number2==0) {
			System.out.println("denominator operation cannot be 0.");
			return number2;
		}else {
			System.out.println("Division result : " + result);
			return result;
		}
		
	}
	
	
}
