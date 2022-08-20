package Assignment_3;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your lucky number:");
		int num = sc.nextInt();
		try {
			if(num<0)
				throw new NumberFormatException("-ve is not allowed");
		else 
			System.out.println("lucky num is "+num);

	}
		catch(NumberFormatException e) {
			System.out.println(e);
		}

 }
}