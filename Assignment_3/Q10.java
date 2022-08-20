package Assignment_3;

public class Q10 {
	static int FIB(int n) {
		if(n<=2)
			return 1;
		else 
			return FIB(n-1)+FIB(n-2);
	}

	public static void main(String[] args) {
		System.out.println(FIB(7));

	}

}
