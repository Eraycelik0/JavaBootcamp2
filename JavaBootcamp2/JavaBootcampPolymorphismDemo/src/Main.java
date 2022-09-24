
public class Main {

	public static void main(String[] args) {
		/*BaseLogger[] loggers = new BaseLogger[] {new FilerLogger(), new DataBaseLogger(), new EmailLogger(), new ConsoleLogger() };

		for (BaseLogger logger : loggers) {
			logger.Log("Log message");
		}*/

		CustomerManager customerManager = new CustomerManager(new FileLogger());
	
		customerManager.add();
	}

}
