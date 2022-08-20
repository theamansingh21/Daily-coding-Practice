package LinkedList;

public class LL {
	private int size;
	LL() {
		this.size=0;
	}
	public int getsize() {
		return size;
	}
	                               
	Node head;
	class Node {
		String data;
		Node next;
		 
		Node (String data) {
			this.data=data;
			this.next=null;
			size++;
		}
	}
	// Add First
	void addFirst(String data) {
		
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	// Add Last
	void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		// Traverse
		Node currNode = head; 
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
			
	}
	// Print List
	void printList() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		Node currNode=head;
	    while(currNode != null) {
	    	System.out.print(currNode.data+"-->>");
	    	currNode=currNode.next;
	    }
	    System.out.println("NULL");
	}
	    
	    

	    
	// DElete FIrst
	void deleteFirst() {
		if(head==null) {
			System.out.println("List Is Empty");
			return;
		}
		size--;
		head=head.next;
	}
	
	//Delete Last
	void deleteLast() {
		if(head==null) {
			System.out.println("List Is Empty");
			return;
		}
		size--;
		if(head.next==null) {
			head=null;
			return;
		}
		// Traverse
		
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next !=null) {
			lastNode=lastNode.next;
			secondLast=secondLast.next;
		}
		secondLast.next=null;
	}
	
//	void reverseIterate() {
//		if(head == null || head.next  == null) {
//			return;
//		}
//		Node prevNode = head;
//		Node currNode = head.next;
//		
//		while(currNode != null) {
//			Node nextNode = currNode.next;
//			currNode.next = prevNode;
//			
//			//update
//			prevNode = currNode;
//			currNode = nextNode;
//		}
//		head.next = null;
//		head = prevNode;
//	}
	
	public Node reverseRecursive(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node newHead = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	
	public static void main(String[] args) {
		LL list=new LL();
		
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		
		list.addLast("List");
		list.printList();
		
		list.addFirst("this");
		list.printList();
		
		list.deleteLast();
		list.printList();
		
		list.deleteFirst();
		list.printList();
		
		list.addLast("List");
		list.printList();
		
		list.addFirst("this");
		list.printList();
		
		//list.reverseIterate();
		list.head = list.reverseRecursive(list.head);
		list.printList();
		
		System.out.println(list.getsize());
		
		

	}

}
