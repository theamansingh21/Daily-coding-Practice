package Assignment2;
class pointType {
	int x;
	int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
class circleType extends pointType {
	double r;
	pointType p1 =new pointType(); 
	public double getR()
	{
		return r;
	}
	void setR(circleType c1){
		r=Math.sqrt(Math.pow((p1.x-c1.x),2)+Math.pow((p1.y-c1.y),2));
		System.out.println("Distance ="+r);
	}
	void area() {
		double a = Math.PI*r*r;
		System.out.println("Area is="+a);
	}
	void circumaference() {
		double c = Math.PI*r*2;
		System.out.println("circumference is="+c);
	}
}
public class Q4 {

	public static void main(String[] args) {
		 
		
		 circleType ob = new circleType();
		 ob.setX(10);
		 ob.setY(20);
		 ob.setR(ob);
		 ob.area();
		 ob.circumaference();

	}

}
