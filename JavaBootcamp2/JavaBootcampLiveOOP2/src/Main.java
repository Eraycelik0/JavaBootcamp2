
public class Main {

	public static void main(String[] args) {
		String message = "maturity rate";

		Product product1 = new Product();
		product1.setName("Delonghi Coffee Maker");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("coffee.image");

		Product product2 = new Product();
		product2.setName("Sigme Coffee Maker");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(3);
		product2.setImageUrl("coffee.image");

		Product product3 = new Product();

		product3.setName("Kitchen Aid Coffee Maker");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitInStock(3);
		product3.setImageUrl("coffee.image");

		Product[] products = { product1, product2, product3 };
		System.out.println("</ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();

		individualCustomer.setId(1);
		individualCustomer.setPhone("0522222");
		individualCustomer.setCustomerNumber("12345");
		
		individualCustomer.setFirstName("Eray");
		individualCustomer.setLastName("Celik");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("23232323");
		corporateCustomer.setCustomerNumber("2212");
		
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("212121");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
	
		for (Customer customer : customers) {
			System.out.println(customer.getCustomerNumber());
		}
		
	}
}
