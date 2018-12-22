package selfStudy.javaCloth;

public class Cloth {

	private String sex;
	private String brand;
	private String size;
	private String type;
	private int price = 0;
	
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
	
//	public Cloth(String size) {
//		this.size = size;
//		this.price = Integer.parseInt(this.size);
//	}
//	Example of broken constructor...
	
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
	
	public int compareToByPrice(Cloth co) {
		if (this.price < co.getPrice()) {
			return -1;
		} else if (this.price > co.getPrice()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public int compareToByBrand(Cloth co) {
		if (this.brand.compareTo(co.getBrand()) < 0) {
			return -1;
		} else if (this.brand.compareTo(co.getBrand()) > 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public int compareTo(Cloth co) {
		if (this.compareToByPrice(co) == 0 ) {
			return this.compareToByBrand(co);
		} else {
			return this.compareToByPrice(co);
		}
	}
	//Learn how to RE-USE functions you wrote, so you don't have to rewrite the SAME functions...
	
//	public String toString() {
//		return "{Sex: " + this.sex + ";" + 
//				" Brand: " + this.brand + ";" +
//				" Size: " + this.size + ";" + 
//				" Type: " + this.type + ";" +
//				" Price: " + this.price + "}";
//	}
	
	public String toString() {
		String result = "{";
		if(this.sex != null) {
			result = result + "Sex: " + this.sex + ", ";
		}
		if(this.brand != null) {
			result = result + "Brand: " + this.brand + ", ";
		}
		if(this.size != null) {
			result = result + "Size: " + this.size +", ";
		}
		if(this.type != null) {
			result = result + "Type: " + this.type + ", ";
		}
		
		result = result + "Price: " + this.price;
		
		return result + "}";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
