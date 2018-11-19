package forVictory.bikes;

public class Bike {
	
	private String name;
	private double weight;
	private double price;
	
	public Bike(String name, double weight, double price) {
		this.name = name;
		this.weight = weight;
		this.price = price;	
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}


}
