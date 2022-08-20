package Assignment2;
class person {
	String name;
	int age;
	person(int age,String name) {
		super();
		this.age=age;
		this.name=name;
	}
}
class studemt extends person {
	String course;
	int roll;
	double marks;
	studemt(int age,String course,String name ,int roll,double marks){
		super(age,name);
		this.course=course;
		this.roll=roll;
		this.marks=marks;
	}
	void display() {
		System.out.println("age="+age+"Name="+name+"Course="+course+"Roll="+roll+"Marks="+marks);
	}
}
class teacher extends person {
	String subject;
	int ca;
	teacher(int age,String name,String subject,int ca) {
		super(age,name);
		this.subject=subject;
		this.ca=ca;		
	}
	void display() {
		System.out.println("Age ="+age+"NAme="+name+"Subject="+subject+"ca ="+ca);
	}
}
  public class Q5 {

	public static void main(String[] args) {
		studemt ob = new studemt(20,"aman","cse",48,100);
		ob.display();
		teacher obj = new teacher(48,"abc","cal",15);
		obj.display();
		

	}

}
