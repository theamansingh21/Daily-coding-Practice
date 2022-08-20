package Assignment_2;
import java.util.Scanner;
interface person {
	public abstract void display();
	public abstract void count();
}
class details implements person {
	String name;
	static int maxcount=0;
	details(String n) {
		name = n;
	}
	public void count() {
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			maxcount++;
		}
		
	}
	public void display() {
		System.out.println("name of the person is "+name);
		System.out.println("Number of the character is "+maxcount);
	}
}
public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String n = sc.nextLine();
		details ob = new details(n);
		ob.count();
		ob.display();
		
		

	}

}
