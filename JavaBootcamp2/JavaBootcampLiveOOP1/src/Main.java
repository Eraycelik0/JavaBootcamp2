
public class Main {

	public static void main(String[] args) {
		String message = "maturity rate";

		Product product1 = new Product();
			// set value
		product1.name = "Delonghi Coffee Maker";
		product1.discount = 7;
		product1.unitInStock = 4;
		product1.unitPrice = 7500;
		product1.imageUrl = "coffeeMaker.image";
			// get
		/*
		 * System.out.println(product1.name); System.out.println(product1.discount);
		 * System.out.println(product1.unitInStock);
		 * System.out.println(product1.unitPrice);
		 * System.out.println(product1.imageUrl);
		 */

		Product product2 = new Product();
		
		product2.name = "Smeg Coffee Maker";
		product2.discount = 7;
		product2.unitInStock = 4;
		product2.unitPrice = 7500;
		product2.imageUrl = "coffeeMaker.image";

		Product product3 = new Product();
		
		product3.name = "Kitchen Aid Coffee Maker";
		product3.discount = 7;
		product3.unitInStock = 4;
		product3.unitPrice = 7500;
		product3.imageUrl = "coffeeMaker.image";
		
		Product[] products = {product1, product2, product3};
		System.out.println("</ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.name + "</li>");
			}
		System.out.println("</ul>");
	}

}
