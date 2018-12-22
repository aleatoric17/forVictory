package selfStudy.javaCar;

public class Car {

	private String brand;
	private String model;
	private double price;
	
	public Car(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setBrand(String cb) {
		this.brand = cb;
	}
	
	public void setName(String cm) {
		this.model = cm;
	}
	
	public void setPrice(int cp) {
		this.price = cp;
	}
	
	public String toString() {
		return "{Brand: " + this.brand + "; Model: "
				+ this.model + "; Price: $" 
				+ this.price + "}";
	}
	
	public String toDiscount(double percent) {
		this.price = this.price*percent;
		return "{Discount: " + percent*100 + "%" + " Price: " + this.price + "}";
	}
	
	public int comparePriceTo(Car co) {
		if(this.price > co.getPrice()) {
			return -1;
		} else if(this.price < getPrice()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public int compareBrandTo(Car co) {
		if(this.brand.compareTo(co.getBrand()) > 1) {
			return -1;
		} else if(this.brand.compareTo(co.getBrand()) < 1) {
			return 1;
		} else {
			return 0;
		}
	}
	
	
	
	
	
	
	
	
	
}
