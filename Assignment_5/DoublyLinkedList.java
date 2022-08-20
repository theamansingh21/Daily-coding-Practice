package Assignment_5;
import java.util.Scanner;
public class DoublyLinkedList {
	Node head;
	Node end;
	
	class Node {
		int data;
		Node next,prev;
	}
	// create
	void create() {
		Scanner sc = new Scanner(System.in);
		Node p = new Node();
		System.out.println("Enter value");
		p.data = sc.nextInt();
		p.next = null;
		p.prev = null;
		head = p;
		end = p;
		System.out.println("Add one more Node ? if yes press 1");
		int op = sc.nextInt();
		while(op == 1)
		{
			Node q = new Node();
			q.next = null;
			q.prev = null;
			System.out.println("Enter value");
			q.data = sc.nextInt();
			p.next = q;
			q.prev = p;
			p = q;
			end = p;
			System.out.println("Add one more Node ? if yes press 1");
			op = sc.nextInt();
			
		}

}
	//display forward
	
	void displayFor() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"---->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	// display backward
	void displayBack() {
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		while(temp !=null) {
			System.out.print(temp.data+"---->");
			temp = temp.prev;
		}
		System.out.println("NULL");
	}
	
	//search
	void search() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be searched :-");
		int n = sc.nextInt();
		Node temp = head;
		int count = 0;
		while(temp != null) {
			count++;
			if(n == temp.data)
				break;
			temp = temp.next;
		}
		if(temp != null)
			System.out.println(n+"is at position"+count+".");
		else 
		System.out.println("Element not Found");
		
	}
	//Size
	int count() {
		Node temp = head;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		int result = count;
		System.out.println(result);
		return count;
	}
	// insert at beginning
	
	void insert_beg() {
		Node q = new Node();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		q.data = sc.nextInt();
		q.next = null;
		q.prev = null;
		if(head == null) {
			head = end = q;
		}
		else {
			q.next = head;
			head.prev = q;
			q.prev = null;
			head = q;
		}
		
	}
	//insert at end
	
	void insert_end() {
		Node q = new Node();
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter value");
	    q.data = sc.nextInt();
	    q.next = null;
	    q.prev = null;
	    if(head == null) {
	    	head = end = q;
	    }
	    else {
	    	end.next = q;
	    	q.prev = end;
	    	q.next = null;
	    	end = q;
	    }
	}
	//insert at any position
	
	void insert_pos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter position where you want to insert:");
		int pos = sc.nextInt();
		int c = count();
		if(pos >=1 && pos <= c+1) {
			if(pos == 1) {
				insert_beg();
			}
			else if(pos == c+1) {
				insert_end();
			}
			else {
				int cnt = 1;
				Node temp = head;
				while(cnt < pos-1) {
					temp = temp.next;
					cnt = cnt+1;
				}
				Node q = new Node();
				System.out.println("Enter data to insert at "+pos+"position");
				q.data  = sc.nextInt();
				q.next = temp.next;
				q.prev = null;
				q.next = temp.next;
				temp.next = q;
				q.prev = temp;
			}
			
		}
		else 
			System.out.println("Invalid position");
	}
	//delete from beginning
	
	void delete_beg() {
		if(head == null) {
			System.out.println("list is empty");
		return;
	}
	if(head.next == null)
		head = end = null;
	else {
		Node p = head;
		head = head.next;
		p.next = null;
		p.prev = null;
		p = null;
		System.out.println("Your first element is deleted");
	    }
     }
	// delete from end 
	void delete_end() {
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		else if(head.next == null) {
			head = end = null;
		}
		else {
			Node temp = head;
			while(temp.next.next != null) {
				temp = temp.next;
			}
			Node p = temp.next;
			p.prev = null;
			temp.next = null;
			end = end.prev;
			p = null;
			System.out.println("your last number is deleted ");
		}
	}
	//delete from any position
	void delete_pos() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the position to be deleted");
		int pos = sc.nextInt();
		int c = count();
		if(pos >= 1 && pos <=c) {
			if(pos == 1) {
				delete_beg();
			}
			else if(pos == c) {
				delete_end();
			}
			else  {
				if(head == null) {
					System.out.println("list is empty");
					return;
				}
				int cnt = 1;
				Node temp = head;
				while(cnt < pos-1) {
					temp = temp.next;
					cnt = cnt+1;
				}
				Node p = temp.next;
				p.prev.next = p.prev;
				p.next = null;
				p.prev = null;
			}
		}
		else 
			System.out.println("Invalid position");
	}
}
