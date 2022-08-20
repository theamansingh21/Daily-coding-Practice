package Assignment2;
import java.util.Scanner;
 interface Empinterface {
	 public abstract void displayEmp();
	 public abstract void giveBonus(double amount);
 }
 abstract class Employee implements Empinterface {
	 int empId;
	 String fName , lName;
	 double salary;
	 Employee(int e, String fN , String lN , double s) {
		 empId = e;
		 fName = fN;
		 lName = lN;
		 salary = s;
	 }
 }
class Manager extends Employee {
	 double bonus;
	 Manager(double bonus,int empId,String fName,String lName,double salary) {
		 super(empId,fName,lName,salary);
		 this.bonus = bonus;
	 }
	 public void displayEmp() {
		 
	 }
	 public void giveBonus(double amount) {
		 
	 }
 }
public class Question_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double b = 0.0;
		System.out.println("Input Manager array size ");
		int n = sc.nextInt();
		Manager a[] = new Manager[n];
		for(int i = 0; i < n; i++) {
			try {
				System.out.println("Enetr bonus");
				b = sc.nextDouble();
				if(b <= 0) {
					throw new ArithmeticException("Invalid bonus");
				}
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			System.out.println("input employee id , first name , last name , salary and bonus");
			int empId = sc.nextInt();
			String fName = sc.next();
			String lName = sc.next();
			double salary= sc.nextDouble();
			double bonus = sc.nextDouble();
			a[i] = new Manager(bonus,empId,fName,lName,salary);
		}
		for(int i = 0;i < a.length;i++) {
			System.out.println("details");
			a[i].giveBonus(b);
			a[i].displayEmp();
		}

	}

}
