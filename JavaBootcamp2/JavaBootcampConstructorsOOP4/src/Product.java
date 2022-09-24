
public class Product {
	
	public Product(int id, String name, String descrition, double price, int stockAmount, String color) {
		System.out.println("Constructors");
		this.id = id;
		this.color = color;
		this.name = name;
		this.description = descrition;
		this.stockAmount = stockAmount;
		this.price = price;
	}
	public Product() {
		
	}
	
	// this : Using this shows the definition in the class I'm in
	// attribute | field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String color;
	private String code;
	//Getter
	public int getId() {
		return id;
	}
	//Setter
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCode() {
		return this.name.substring(0,1) + id;
	}

	

}
