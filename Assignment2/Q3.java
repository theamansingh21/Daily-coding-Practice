package Assignment2;

import java.util.Scanner;

class student {
	int roll;
	String name;
	String course;
	 void input_student() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the name ,roll and course name:");
		 name = sc.nextLine();
		 roll= sc.nextInt();
		 course = sc.nextLine();
	} 
		 void display_student() {
			 System.out.println("Name is:"+name+"Roll no is:"+roll+"Course is:"+course);
	}
	 
}
class exam extends student {
	int mark1,mark2,mark3,sum;
	void input_mark() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks:");
		mark1=sc.nextInt();
		mark2=sc.nextInt();
		mark3=sc.nextInt();
		
	}
	void display_result() {
		sum = mark1+mark2+mark3;
		System.out.println("Result"+sum);
	}
}
public class Q3 {

	public static void main(String[] args) {
		exam arr[] = new exam[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=new exam();
			arr[i].input_student();
			arr[i].display_student();
			arr[i].input_mark();
			arr[i].display_result();
		}
		

	}

}
