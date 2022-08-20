package Assignment_4;
import java.util.Scanner;
public class LinkedList {
	Scanner sc = new Scanner(System.in);
	Node start;
	void create() {
		Node p = new Node();
		p.link=null;
		System.out.println("Enter data");
		p.data=sc.nextInt();
		start = p;
		System.out.println("Add one more ?Yes : 1");
		int op= sc.nextInt();
		while(op==1) {
			Node q = new Node();
			q.link = null;
			System.out.println("Enter data");
			q.data = sc.nextInt();
			p.link = q;
			p=q;
			System.out.println("Add one More ? Yes:1");
			op = sc.nextInt();
			
		}
	}
	
	// Display
	void display() {
		Node temp ;
		temp = start;
		while(temp != null) {
			System.out.println(temp.data+"--->");
			temp = temp.link;
		}
		System.out.println("NULL");
	}
	
	// Size
		int count() {
			Node temp ;
			temp = start;
			int cnt = 0;
			while(temp != null) {
				cnt++;
				temp = temp.link;
			}
			int result = cnt;
			System.out.println(result);
			return cnt;
		}
	
	// Search
	void search() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements to be searched :-");
		int n = sc.nextInt();
		Node temp;
		temp = start;
		int cnt = 0;
		while(temp != null) {
			cnt++;
			if(n==temp.data)
				break;
			temp=temp.link;
		}
		if(temp != null)
			System.out.println(n+"is at position "+cnt);
		else
			System.out.println("element is not found");
	}
	
	// insert beginning
	void insert_beg() {
		Scanner sc = new Scanner(System.in);
		Node q = new Node();
		q.link = null;
		System.out.println("Enter Value To insert in the beginning :-");
		q.data = sc.nextInt();
		q.link = start;
		start = q;
	}
	
	// insert end
	void insert_end() {
		Node temp;
		temp = start;
		while(temp.link != null) {
			temp = temp.link;
		}
		Scanner sc = new Scanner(System.in);
		Node q = new Node();
		q.link = null;
		System.out.println("Enter a value to insert at end :-");
		q.data = sc.nextInt();
		temp.link = q;
	}
	
	// insert at any position
	void insert_pos() {
		System.out.println("Enter your position");
		int pos = sc.nextInt();
		int c = count();
		if(pos >= 1 && pos <= c+1) {
			if(pos == 1) {
				insert_beg();
			}
			else if(pos == c+1) {
				insert_end();
			}
			else {
				int cnt = 1;
				Node temp;
				temp = start;
				while(cnt < pos-1) {
					temp  = temp.link;
					cnt++;
				}
				Node q = new Node();
				System.out.println("Enter data");
				q.data = sc.nextInt();
				q.link  = temp.link;
				temp.link = q;
			}
		}
		else 
			System.out.println("Invalid position");
	}
	
	// delete beginning
	void delete_beg() {
		if(start == null) {
		  System.out.println("list is Empty");
		  return;
		}
		Node p;
		p = start;
		start = start.link;
		p.link = null;
		p = null;
		System.out.println("your element is deleted");
	}
	
	// delete_end
	void delete_end() {
		if(start == null) {
			System.out.println("underflow");
			return;
		}
		else if(start.link == null) {
			start = null;
		}
		else {
			Node temp = start;
			while(temp.link.link != null) {
				temp = temp.link;
			}
			Node q = temp.link;
			temp.link = null;
			q = null;
		}
	}
	// delete at any position
	void delete_pos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a position");
		int pos = sc.nextInt();
		int c = count();
		if(pos >= 1 && pos<=c) {
			if(pos == 1) {
				delete_beg();
				}
			else if(pos == c) {
				delete_end();
			}
			else {
				if(start == null) {
					System.out.println("list is empty");
					return;
				}
			    int cnt = 1;
			    Node temp  = start;
			    while(cnt < pos-1) {
			    	temp = temp.link;
			    	cnt = cnt+1;

			    }
			    Node P = temp.link;
			    temp.link = temp.link.link;
			    P.link = null;
			    } 
			
		}
		else
			System.out.println("Invalid position");
	}
	//Sorting
	
	void sort() {
		for(Node i = start;i != null;i = i.link) {
			for(Node j = i.link;j != null;j = j.link) {
				if(i.data>j.data) {
					int temp = i.data;
					i.data = j.data;
					j.data = temp;
				}
			}
		}
	}
	// Reverse
	void rev() {
		Node preNode = null;
		Node currNode = start;
		Node nextNode = start.link;
		while(currNode.link != null) {
			currNode.link = preNode;
			preNode = nextNode;
			nextNode = nextNode.link;
		}
		currNode.link = preNode;
		start = currNode;
	}

}
