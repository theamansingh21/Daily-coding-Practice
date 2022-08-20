package Assignment_3;
import java.util.Scanner;
class MarksOutOfBoundsException extends Exception {
	MarksOutOfBoundsException(String s) {
		super(s);
	}
}

class Student {
	String name;
	int mark;
	Student(String name, int mark) {
		this.name=name;
		this.mark=mark;
	}
	void display() {
		System.out.println("Name = "+name);
		System.out.println("Marks = "+mark);
	}
}
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name and Marks");
		String name= sc.nextLine();
		int marks = sc.nextInt();
		Student s1 = new Student(name,marks);
		s1.display();
		try {
			if(marks >=100) {
				throw new MarksOutOfBoundsException("Marks is not valid");
				
			}
		}
			catch(MarksOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
		}

	}


