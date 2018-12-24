package forVictory.linkedListPractice;

public class RunListNode {

	public static void main(String[] args) {
		

		ListNode head = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3))));
/*		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		
		ln1.setNext(ln2);
		ln2.setNext(ln3);		
*/
		
//		System.out.println(head);
//		above code is equal to
//		System.out.println(ln1.toString());
		
		ListNode temp = head;
//		We assign head's address to temp...
//		while (temp.getNext() != null) {
//			System.out.println(temp.toString());
//			temp = temp.getNext();
//		}
//		
//		System.out.println(temp.toString());
//		findValue(0, head);
		
		
		head.findValue(0);
		
	}
	
//		Use while loop to look for target value, from head to the last element
//		1. use while loop and the condition is keep repeating while the iterator next node is not null
	
	
//		2. if the iterator's current value is equal to target value...print "found the target"
//		3. if it is not, go to the next node
//		4. repeat until the next node is null
//		5. if target value does not equal to any node value, print "target not found"
	

	
	public static boolean findValue(int target, ListNode ln) {
		ListNode temp = ln;
		
		while(temp.getNext() != null) {
			
			if(target == temp.getValue()) {
				System.out.println("Found the Target...");
				return true;
			} 
			
			temp = temp.getNext();

		}
		if(target == temp.getValue()) {
			System.out.println("Found the Target...");
			return true;
		} else {
			System.out.println("Target not Found...");
			return false;
		}
	}
}


	