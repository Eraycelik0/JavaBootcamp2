
public class Main {

	public static void main(String[] args) {
		
		int score = 95;
		// 50 and above : passed
		// Between 40 and 49 : integration
		// 0 to 39 : left
		
		if (score >= 50) {
			System.out.println("passing grade : " + score);
		}else if(score>=40 && score<=49 ) {
			System.out.println("you are left to integrate : " + score);
		}else {
			System.out.println("you failed, exam grade: " + score);
		}
		
	}
}
