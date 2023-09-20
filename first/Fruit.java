package first;

public class Fruit {
	String name="Apple";
     String color="Red";
     void show() {
    	 System.out.println("Name of Fruit= " +name);
    	 System.out.println("Name of Color= " +color);
     }
	public static void main(String[] args) {
    Fruit object=new Fruit();	
    object.show(); 
	}
}
