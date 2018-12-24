package forVictory.linkedListPractice;

public class ListNode {
	
	private int value;
//	private ListNode previous;
	private ListNode next;
	
	public ListNode(int value, ListNode next) {
		this.value = value;
//		this.previous = previous;
		this.next = next;
	}
	
	public ListNode(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public ListNode getNext() {
		return this.next;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void setNext(ListNode next) {
		this.next = next;
	}
	
	public String toString() {
		return "{Value: " + this.value + "}";
	}

	public void findValue(int target) {
		ListNode temp = this;
		boolean targetFound = false;
		while(temp.getNext() != null) {
			
			if(target == temp.getValue()) {
				System.out.println("Found the Target...");
				targetFound = true;
			}
			temp = temp.getNext();
			
		}
		if(target == temp.getValue()) {
			System.out.println("Found the Target...");
		} 
		if(target != temp.getValue() && !targetFound) {
			System.out.println("Target not Found...");
		}
	}
	
	
}
