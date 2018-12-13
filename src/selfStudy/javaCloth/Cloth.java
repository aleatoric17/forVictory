package selfStudy.javaCloth;

public class Cloth {

	private String sex;
	private String brand;
	private String size;
	private String type;
	private int price;
	
	public Cloth(String sex, String brand, String size, String type, int price) {
		this.sex = sex;
		this.brand = brand;
		this.size = size;
		this.type = type;
		this.price = price;
	}
	
	public Cloth(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	
	public String getSex() {
		return this.sex;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getSize() {
		return this.size;
	}
	
	public String gettype() {
		return this.type;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int comparePriceTo(Cloth co) {
		if (this.price < co.getPrice()) {
			return -1;
		} else if (this.price > co.getPrice()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public int compareBrandTo(Cloth co) {
		if (this.brand.compareTo(co.getBrand()) < 0) {
			return -1;
		} else if (this.brand.compareTo(co.getBrand()) > 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public String toString() {
		return "{Sex: " + this.sex + ";" + 
				" Brand: " + this.brand + ";" +
				" Size: " + this.size + ";" + 
				" Type: " + this.type + ";" +
				" Price: " + this.price + "}";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
