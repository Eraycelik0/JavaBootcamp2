
public class Main {

	public static void main(String[] args) {
		/*
		Product product = new Product();

		product.name = "Laptop";
		product.id = 1;
		product.description = "Asus Laptop";
		product.price = 5000;
		product.stockAmount = 3;

		System.out.println(product.name);
		System.out.println(product.id);
		System.out.println(product.description);
		System.out.println(product.price);
		System.out.println(product.stockAmount);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		// It's not useful
		
		 * productManager.Add2(1, "", "", 2, 200); 
		 * productManager.Add2(1, "", "", 2,200); 
		 * productManager.Add2(1, "", "", 2, 200); 
		 * productManager.Add2(1, "", "", 2, 200);
		 */
	
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		System.out.println(product.getCode());
		
		
	
	}

}
