package Assignment_5;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList list = new DoublyLinkedList();
		list.create();
		while(true) {
			System.out.println("1-display forward");
			System.out.println("2-display backward");
			System.out.println("3-search");
			System.out.println("4-count");
			System.out.println("5-insert at begninnig");
			System.out.println("6-insert at end");
			System.out.println("7-insert at any position");
			System.out.println("8-delete at beginning");
			System.out.println("9-delete at end");
			System.out.println("10-delete at any posititon");
			System.out.println("11-exit");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:list.displayFor();
			break;
			case 2:list.displayBack();
			break;
			case 3:list.search();
			break;
			case 4:list.count();
			break;
			case 5:list.insert_beg();
			break;
			case 6:list.insert_end();
			break;
			case 7:list.insert_pos();
			break;
			case 8:list.delete_beg();
			break;
			case 9:list.delete_end();
			break;
			case 10:list.delete_pos();
			break;
			case 11: return;
			default:System.out.println("Invalid choice");
			}
		}

	}

}
