package Assignment1; 
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n = sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the value:");
		for(int i =0;i<n;i++)
			array[i]=sc.nextInt();
		Q7 ob = new Q7();
		System.out.println(ob.findDistinctPair(array));
	}
	boolean findDistinctPair(int array[]) {
		int count=0;
		l1:for(int i=0;i<array.length;i++)
			for(int j=0;j<array.length;j++)
				if(array[i]!=array[j]&&array[i]*array[j]%2==1)	
				{
					count ++;
					if(count==2)
						break l1;
				}
		if(count == 2)
			return true;
		else 
			return false;
	}

}
