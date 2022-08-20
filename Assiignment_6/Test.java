package Assiignment_6;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack st = new Stack();
		while(true)
		{
			System.out.println("1-push");
			System.out.println("2-pop");
			System.out.println("3-peek");
			System.out.println("4-Exit");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch(ch) {
			case 1 : System.out.println("Enter element");
			int x = sc.nextInt();
			st.push(x);
			break;
			case 2 :x = st.pop();
			if(x != -1)
				System.out.println("the popped element is"+x);
			break;
			case 3:x = st.peek();
			if(x != -1)
				System.out.println("the top element is " +x);
			break;
			case 4 : return;
			default : System.out.println("invalid choice");
			}
		}
	}

}
