package Assignment2;
class complex {
	int real;
	int image;
	void setData(int r,int i) {
		real = r;
		image = i;
	}
	void display() {
		System.out.println("The complex  number is :"+real+" +i"+image);
	}
	complex add(complex c1,complex c2) {
		complex c =  new complex();
		c.real=c1.real+c2.real;
		c.image=c1.image+c2.image;
		return c;
	}
}
public class Q2 {

	public static void main(String[] args) {
		complex c1 = new complex();
		c1.setData(2, 11);
		c1.display();
		complex c2 = new complex();
		c2.setData(5, 6);
		c2.display();
		complex c = c1.add(c1, c2);
				c.display();
	}

}
