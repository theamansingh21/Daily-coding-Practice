package Regd_No_2141018033;

import java.util.Scanner;

public class LinkedList {
	Scanner sc = new Scanner(System.in);
	Node Start;
	
//create	
	void create() {
		Node p = new Node();
		p.link = null;
		System.out.println("Enter info");
		p.info = sc.nextInt();
		Start = p;
		
		System.out.println("if u want to add one more node ? if yes press : 1 ");
		int op = sc.nextInt();
        while(op == 1) {
			Node q = new Node();
			q.link = null;
			System.out.println("Enter info ");
			q.info = sc.nextInt();
			p.link = q;
			p = q;
			System.out.println("if u want to add one more node ? if yes press : 1 ");
			op = sc.nextInt();
		}
	}

//display
	void display() {
		Node temp;
		temp = Start;
		while(temp != null) {
            System.out.print(temp.info + "---->");
			temp = temp.link;
		}
		System.out.println("NULL");
		
	}
	
//find second largest element
	void find2ndMax() {
		int i, first , second;
		int size = countUnique();
		if(size < 2) {
			System.out.println("invalid input.");
			return;
		}
        first = second = Integer.MIN_VALUE;
		Node temp = Start;
		
		while(temp != null ) {
			if(temp.info > first) {
				second = first;
				first = temp.info;
			}
			else if (temp.info > second && temp.info != first)
				second = temp.info;
			
			    temp = temp.link;
		}
        if(second == Integer.MIN_VALUE)
			System.out.println("There is no second largest element.");
		else
			System.out.println("The second largest element is : " +second);
	}
	
//search
	void search() {
		System.out.println("Enter the number to be searched :- ");
		int n = sc.nextInt();
		Node temp;
		temp = Start;
		int count = 0;
		while(temp != null) {
			count++;
			if(n==temp.info)
				break;
			
			temp = temp.link;
        }
		if(temp != null)
			System.out.println(n+ " is at position " +count);
		else 
			System.out.println("Element is not found.");
	}
	
//remove duplicate
	void removeDuplicate() {
		Node curr;
		curr = Start;
		while(curr != null && curr.link != null) {
			Node temp;
			temp = curr;
			while(temp.link != null) {
				if(curr.info == temp.link.info) {
					temp.link = temp.link.link;
					System.gc();
				}
				else {
					temp = temp.link;
				}
			}
			curr = curr.link;
		}
	}
	
	
//count	
	int countUnique() {
		Node temp;
		temp = Start;
		int count = 0;
		
		while(temp != null) {
			count++;
			 temp = temp.link ;
		}
		int result = count;
		System.out.println(result);
		return count;
	}

}
  


