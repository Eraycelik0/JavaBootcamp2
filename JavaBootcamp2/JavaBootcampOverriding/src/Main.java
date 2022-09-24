
public class Main {

	public static void main(String[] args) {
		BaseCreditManager[] creditManagers = new BaseCreditManager[] {new TeacherLoanManager(), new AgriculturalLoanManager(), new StudentLoanManager()};
		
		for(BaseCreditManager creditManager : creditManagers) {
			System.out.println(creditManager.calculate(10000));
		}
	}

}
