package Assignment2;
abstract class shape {
	abstract void area();
	void shape() {
		
	}
}
class square extends shape {
	int length;
	square(int l) {
		length = l;
	}
	void area() {
		int area = length*length;
		System.out.println("Area is ="+area);
	}
}
class triangle extends shape {
	double base,height;
	triangle(double b,double h) {
		base = b;
		height = h;
	}
	void area() {
		double areaOfTriangle  = 0.5*base*height;
		System.out.println("area of triangle is = "+areaOfTriangle);
	}
}
class circle extends shape {
	double radius;
	circle(double r) {
		radius = r;
	}
	void area() { 
		double areaOfCircle  = Math.PI*radius*radius;
		System.out.println("area of circle  is="+areaOfCircle);
	}
}

public class Q6 {

	public static void main(String[] args) {
	square sq = new square(4);
	sq.area();
	triangle tri = new triangle(6.0,8.0);
	tri.area();
	circle ci = new circle(9);
	ci.area();
	}

}
