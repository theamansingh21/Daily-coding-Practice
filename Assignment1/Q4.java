package Assignment1;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of  lines");
		int a =sc.nextInt();
		String obj[]=new String[a];
		sc.nextLine();
		for(int i=0;i<a;i++)
		{
			System.out.println("Enter a sentence");
			obj[i]=sc.nextLine();
		}
		System.out.println("display in reverse order");
		for(int i=a-1;i>=0;i--)
			System.out.println(obj[i]);

	}

}
