package Assignment1;
class point {
		double x,y;
		
		void setPoint(double a,double b) {
			x=a;
			y=b;
		}
		static double findDistance(point p1,point p2) {
			double d = Math.sqrt(Math.pow((p1.x-p2.x), 2) + Math.pow((p1.y-p2.y), 2));
			return d;
		}
		
	
} 
	
public class Q11 {

	public static void main(String[] args) {
		point p1 = new point();
		p1.setPoint(10.0,30.5);
		point p2 = new point();
		p2.setPoint(22.8,4.0);
		System.out.println("The distance between two points;"+p1.findDistance(p1, p2));
		

	}

}
