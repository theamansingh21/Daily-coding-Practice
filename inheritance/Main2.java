package inheritance;


	class person
	{
		 String name;
		  void walk()
		{
			System.out.println(name+" is walking");
		}
		 void eat()
		{
			System.out.println(name+" is eating");
		}
	
	}
	 class Teacher extends person{
	   void teach() {
			System.out.println(name+" is teaching");
		}
		
	}
	 class Singer extends person{
		 void sing()
		{
			System.out.println(name+" is singing");
		}
	}

	public class Main2 {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.name="Mr.Harry";
		t.eat();
		t.walk();
		t.teach();
		 Singer s = new Singer();
		 s.name="oprah";
		 s.sing();
		 s.eat();


	}

}
