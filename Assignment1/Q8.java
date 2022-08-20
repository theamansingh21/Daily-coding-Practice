package Assignment1;
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int n = sc.nextInt();
	int a[]=new int[n];
	int b[]=new int[n];
	int c[]=new int[n];
	System.out.println("Enter elements of a[];");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("ENter size  of b elements");
	for(int i=0;i<b.length;i++)
	{
		b[i]=sc.nextInt();
	}
	for(int i=0;i<c.length;i++)
	{
		c[i]=a[i]*b[i];
		System.out.println(c[i]+" ");
	}

	}

}
