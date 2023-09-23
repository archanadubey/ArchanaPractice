package linkedlistdemo;

public class SingalyLinkedListD {
	Node head;
	
// create a node class
	class Node{
		String data;
		Node next;
		
		public Node(String data) {
			this.data = data;
			this.next = null;
			
			
		}
	}
		// add first node
		public void addFirst(String data) {
			// check if head is null
			// create a new node
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
				return;
				
				
			}
			// if head is not null then 
			newNode.next = head;
				head = newNode;
			
		}
		
		public void printList() {
			
			if (head == null) {
				System.out.println("List is empty");
				return;
			}
			// to traverse the list create a currentNode
			Node currNode = head;
			
			while(currNode != null) {
				System.out.print(currNode.data+"->");
				currNode = currNode.next;
			}
			
			System.out.println("null");
			
			
		}
	
	public static void main(String[] args) {
		
		//@SuppressWarnings("unused")
		SingalyLinkedListD ll = new SingalyLinkedListD();
		ll.addFirst("a");
		ll.addFirst("is");
		ll.addFirst("mata");
		ll.addFirst("santoshi");
		ll.addFirst("jai");
		ll.printList();


	}
	

}
