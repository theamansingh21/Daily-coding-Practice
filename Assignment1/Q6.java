package Assignment1;

import java.util.Scanner;

public class Q6 {
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter size of an array");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("enter"+n+"array value");
		for(int i=0;i<n;i++)
			array[i]=sc.nextInt();
		int s= smallest(array);
		System.out.println("smallest value="+s);
		int l = largest(array);
		System.out.println("largest value="+l);
		sc.close();
	}


public static int smallest(int array[]) {
	int s = array[0];
	for(int i=1;i<array.length;i++)
		if(array[i]<s)
			s=array[i];
	return s;
}
public static int largest(int array[]) {
	int l = array[0];
	for(int i=1;i<array.length;i++)
		if(array[i]>l)
			l=array[i];
	return l;
  }
}

