package Assignment_3;

public class Q6 {
	public static<T> int count(T[] array, T item) {
		int count = 0;
		for(int i =0;i<array.length;i++) {
			if(array[i].equals(item))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Integer a[] = {1,3,5,3,2,7};
		int c = count(a,5);
		System.out.println(c);
		String str[] = {"i","am","am"};
		c = count(str,"am");
		System.out.println(c);
		Object ob[] = {2,"am",2.3,2.7f};
		c = count(ob,1.2);
		System.out.println(c);

	}

}
