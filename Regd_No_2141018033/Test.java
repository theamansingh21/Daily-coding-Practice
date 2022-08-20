package Regd_No_2141018033;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		ll.create();
		while(true) {
			System.out.println("1-display");
			System.out.println("2-find2ndMax");
			System.out.println("3-search");
			System.out.println("4-remove duplicate");
			System.out.println("5-count");
			System.out.println("6-Exit");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch) {
			case 1: ll.display();
			break;
			case 2: ll.find2ndMax();
			break;
			case 3: ll.search();
			break;
			case 4: ll.removeDuplicate();
			break;	
			case 5: ll.countUnique();
			break;
			case 6: return;
			default : System.out.println("invalid choice. ");
			}
		}
			}




}
