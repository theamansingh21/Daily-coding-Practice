package Assignment_3;
class Box<T> {
	T a;
	void getA() {
		System.out.println(a);
	}
	void setA(T a) {
		this.a = a;
	}
}
public class Q4 {

	public static void main(String[] args) {
		Box<String>ob1 = new Box<String>();
		Box<String>ob2 = ob1;
		ob1.setA("Good afternoon");
		ob2.getA();
	}

}
