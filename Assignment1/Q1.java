package Assignment1;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a,,b,c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a+b==c)
			
		{
			System.out.println("it is correct");
		}
		if(b-c==a)
		{
			System.out.println("it is corrct");
		}
		if(a*b==c)
		{
			System.out.println("it is correct");
		}
		else if(a+b==c&&b-c==a&&a*b==c)
		{
			System.out.println("all are correct");
		}
		else
		{
			System.out.println("nothing is correct");
		}

	}

}
