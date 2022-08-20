package Assignment_4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList ll1 = new LinkedList();
		ll1.create();
		while(true) {
			System.out.println("1-Display");
			System.out.println("2-Count");
			System.out.println("3-search");
			System.out.println("4-Insert beginning");
			System.out.println("5-Insert End");
			System.out.println("6-Insert at pos");
			System.out.println("7-delete beginning");
			System.out.println("8-delete End");
			System.out.println("9-delete at any pos");
			System.out.println("10-sorting");
			System.out.println("11-Reverse");
			System.out.println("12-Exit");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch) {
			case 1: ll1.display();
			break;
			case 2:ll1.count();
			break;
			case 3:ll1.search();
			break;
			case 4:ll1.insert_beg();
			break;
			case 5:ll1.insert_end();
			break;
			case 6:ll1.insert_pos();
			break;
			case 7:ll1.delete_beg();
			break;
			case 8:ll1.delete_end();
			break;
			case 9:ll1.delete_pos();
			break;
			case 10:ll1.sort();
			break;
			case 11:ll1.rev();
			break;
			case 12:return;
			default:System.out.println("invalid choice");
			}
		}

	}

}
