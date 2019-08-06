
public class LinkedList {

	Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	
	public void printFunction() {
		Node nList = head;
		
		while(nList != null) {
			System.out.print(nList.data + " ");
			nList = nList.next;
		}
	}
	
	public static void main(String[] args) {
		
		LinkedList llist = new LinkedList();
		
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		llist.head.next = second;
		
		second.next = third;
		
		
		llist.printFunction();
	
	}
	
}
