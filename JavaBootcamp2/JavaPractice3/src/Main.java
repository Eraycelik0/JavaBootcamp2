import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[100];
		
		for (int i=0; i<100; i++) {
			Random rand = new Random();
			int number = rand.nextInt(1000);
			numbers[i] = number;
		}
		double average1 = average(numbers);
		System.out.println("Average : " + average1);
		
		

	}
	
	public static double average(int[] arrays) {
		double total = 0;
		for (int i=0; i<100; i++) {
			total+=arrays[i];
		}
		return total/100;
	}

}
