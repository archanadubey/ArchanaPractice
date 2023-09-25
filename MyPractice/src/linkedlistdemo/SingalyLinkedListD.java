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
		
		public void addLast(String data) {
			
			Node newNode = new Node(data);
			
			if(head == null) {
				newNode = head;
				return;
				}
			Node currtNode =head;
			
			while(currtNode.next != null) {
				currtNode = currtNode.next;
				
			}
			currtNode.next = newNode;
		}
		
		// deleteFirst Node
		
		public void deleteFirst() {
			if(head == null) {
				System.out.println("list is empty");
				return;
				
			}
			head = head.next;
			
		}
		
		public void deleteLast() {
			if(head == null) {
				System.out.println("list is empty");
				return;
			}
			Node secLastNode = head;
			Node lastNode = head.next;
			while(lastNode.next != null) {
				lastNode = lastNode.next;
				secLastNode = secLastNode.next;
				
			}
				
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
		ll.addLast("power");
		ll.printList();


	}
	

}
