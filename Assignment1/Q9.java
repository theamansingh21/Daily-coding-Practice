package Assignment1;
import java.util.Scanner;

	class Student {
		String name;
		int roll;
		double marks;
		
		void setData() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name:");
			name = sc.nextLine();
			System.out.println("Enter the Roll:");
			roll = sc.nextInt();
			System.out.println("Enter the  Marks:");
			marks = sc.nextDouble();
		}
		void display() {
			System.out.println("Name = "+name);
			System.out.println("Roll = "+roll);
			System.out.println("Marks = "+marks);
		}
	}
public class Q9 {
 public static void main(String[] args) {
	 Student sc = new Student();
	 sc.setData();
	 sc.display();
	 Student obj = new Student();
	 obj.setData();
	 obj.display();
	 Student ob = new Student();
	 ob.setData();
	 ob.display();
	 
		
		
	}

}
