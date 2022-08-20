package Assignment1;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a");
	int a=sc.nextInt();
	int count=0;
	while(a>2)
	{
		a=a/2;
		count++;
	}
	System.out.println("count ="+count);

	}

}
