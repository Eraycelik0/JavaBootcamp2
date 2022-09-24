
public class Car {
	
	private String color;
	private int doors;
	private int wheels;
	private String engine;
	private String model;
	
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return this.model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		
		if (doors < 0) {
			System.out.println("number of doors cannot be less than zero!");
		}else {
			this.doors = doors;
		}
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	
}
