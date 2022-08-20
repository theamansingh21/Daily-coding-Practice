package Assignment_3;

public class Q7 {
	static int Fact(int  num) {
		if(num == 0 || num == 1)
			return 1;
		else return num * Fact(num-1);
	}

	public static void main(String[] args) {
		System.out.println(Fact(6));

	}

}
