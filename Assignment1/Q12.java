package Assignment1;
class flower {
	String name;
	int petals;
	float price;
	
	void setData(String n,int p,float pr) {
		name=n;
		petals=p;
		price=pr;
	}
	void getData() {
		System.out.println("Flower Name:"+name);
		System.out.println("Number of Petals:"+petals);
		System.out.println("Price of FLower is:"+price);
	}
}

public class Q12 {

	public static void main(String[] args) {
		flower ob = new flower();
		ob.setData("lotus",10,50);
		ob.getData();
		flower obj = new flower();
		obj.setData("lily",15,60);
		obj.getData();
		flower sc = new flower();
		sc.setData("Rose", 20, 30);
		sc.getData();

	}

}
