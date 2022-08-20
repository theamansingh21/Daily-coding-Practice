package inheritance;

class Parent {
    void show()
    {
        System.out.println("hii father");
    }
}
  
// Inherited class
class Child extends Parent {
    
    void show()
    {
        System.out.println("Child says namaste");
    }
}

public class Main {
	
	 public static void main(String[] args)
	    {
	        
	        Parent obj1 = new Parent();
	        obj1.show();
	  
	        
	        Child obj2 = new Child();
	        obj2.show();
	    }
	

}
