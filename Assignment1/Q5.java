package Assignment1;
import java.util.Scanner;
public class Q5 {
	public static int isOdd(int number)
	{
		while(number!=1&&number!=0)
			number = number-2;
		return number;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int p=isOdd(n);
		if(p==1)
		{
			System.out.println("odd");
		}	else {
				System.out.println("Even");
			}
		
		
	   
		

	}

}
