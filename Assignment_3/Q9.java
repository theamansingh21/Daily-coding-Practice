package Assignment_3;

public class Q9 {
	int rev = 0;
	int rem;
	int Reverse(int n) {
		if(n == 0)
			return rev;
		else {
			rem=n%10;
			rev = rev*10+rem;
			Reverse(n/10);
		}
		return rev;
	}

	public static void main(String[] args) {
		Q9 a =new Q9();
		System.out.println(a.Reverse(432));

	}

}
