package Assignment_3;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String []a= {"White","Black",null,"Red"};
		try {
			System.out.println(a[2].length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		try {
			a[7]="grey";
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}
