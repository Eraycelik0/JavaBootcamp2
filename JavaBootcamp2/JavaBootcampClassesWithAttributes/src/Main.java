
public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "Black");
		
		Product product2 = new Product();
		product2.setId(1);
		product2.setName("Laptop");
		product2.setDescription("Laptop Asus");
		product2.setPrice(5000);
		product2.setStockAmount(3);
		
		
		System.out.println(product.getId());
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getCode());
		
	}

}
