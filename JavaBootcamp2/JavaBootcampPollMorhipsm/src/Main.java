import java.util.ArrayList;

public class Main {
	//SOLID
	public static void main(String[] args) {
		//CreditManager creditManager = new CreditManager();
		
		//creditManager.add();
		//creditManager.calculate();
		
		//MortgageManager mortgageManager = new MortgageManager();
		//mortgageManager.add();
		
		
		//CreditManager[] credits = new CreditManager[2];
		
		ArrayList<String> sehirler = new ArrayList<String>();
		
		
		ArrayList<CreditManager> credits = new ArrayList<CreditManager>();
		credits.add(new MortgageManager());
		credits.add(new VehicleManager());
		credits.add(new MortgageManager());
		
		for(CreditManager credit : credits) {
			credit.calculate();
		}
		
	}	
}
