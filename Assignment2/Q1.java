package Assignment2;

import java.util.Scanner;

class commission {
	double sales;
	commission(double s) {
		sales=s;
	}
	double getCommission() {
		double x=1;
		if(sales<500)
			x=sales*0.02;
		else if(sales>=500&&sales<5000)
			x=sales*0.05;
		else if(sales>=5000)
			x=sales*0.08;
		return x;
	}
}
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ammount of sales:");
		double s=sc.nextDouble();
		commission ob = new commission(s);
		if(s<0)
		{
			System.out.println("Invalid Input");
		}
		else {
			System.out.println("the commisssion of the salesman is:"+ob.getCommission());
		}

	}

}
