package Assiignment_6;

import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StackLinkedList s1 = new StackLinkedList();
		while(true) {
			System.out.println("1-push");
			System.out.println("2-pop");
			System.out.println("3-peek");
			System.out.println("4-exit");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter element");
			int x = sc.nextInt();
			s1.push(x);
			break;
			
			case 2: x = s1.pop();
			if(x != -1)
				System.out.println("The popped element is "+x);
			break;
			
			case 3: x = s1.peek();
			if(x != -1)
				System.out.println("The peeked element is "+x);
			break;
			
			case 4: return;
			default : System.out.println("Invalid choice");
			}
		}

	}

}
