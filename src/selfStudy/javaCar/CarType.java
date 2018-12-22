package selfStudy.javaCar;

public class CarType {

	private Car[] items;
	private String ownerName;
	
	public CarType(String ownerName, Car[] items) {
		this.ownerName = ownerName;
		this.items = items;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public String setOwnerName(String son) {
		this.ownerName = son;
		return "{New Owner Name: " + son + "}";
	}
	
	public Car[] getItems() {
		return items;
	}
	
	public String setItems(Car[] si) {
		this.items = si;
		return "New Item: " + si + "}";
	}
	
	
	
	
	
	
}
