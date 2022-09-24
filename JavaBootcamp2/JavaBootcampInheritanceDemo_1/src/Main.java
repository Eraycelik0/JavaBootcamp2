
public class Main {
	public static void main(String[] args) {
		/*AgriculturalLoanManager agriculturalLoanManager = new AgriculturalLoanManager();
		TeacherLoanManager teacherLoanManager = new TeacherLoanManager();
		
		agriculturalLoanManager.Calculate();
		teacherLoanManager.Calculate();
		*/
		
		CreditUI creditUI = new CreditUI();
		creditUI.CalculateCredit(new AgriculturalLoanManager());
		
		creditUI.CalculateCredit(new TeacherLoanManager());
		
		creditUI.CalculateCredit(new SoldierLoanManager());
	}
}
