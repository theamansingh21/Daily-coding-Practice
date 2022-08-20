package Assignment1;
class Bauaa{
	String name;
	int roll;
    double marks;
     
    void setData(String n,int r,double m) {
       name = n;
       roll = r;
       marks = m;
    }
    void display() {
    	System.out.println("Enter name:"+name);
    	System.out.println("Enter Roll:"+roll);
    	System.out.println("Enter Marks:"+marks);
    }
}
public class Q10 {

	public static void main(String[] args) {
		Bauaa sc = new Bauaa();
		sc.setData("Saurav",22,30);
		sc.display();
	    Bauaa obj = new Bauaa();
		obj.setData("Raj", 56,27);
		obj.display();
		Bauaa ob = new Bauaa();
		ob.setData("Aman", 48, 18);
		ob.display();
		

	}

}
