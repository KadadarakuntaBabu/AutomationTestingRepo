package practivejava;

public class Demo {

	public static void main(String[] args) {
	
		Car bmw = new Car();  // object creation for car
		
		bmw.colour = "black";
		bmw.cost   = 30000;
		bmw.model = "A model";    // intiating 
		bmw.milage = 23;
		
		//access methods 
		bmw.startcar();
		bmw.stopcar();
		bmw.cardetails();
		
		System.out.println(bmw.colour);
		System.out.println(bmw.model);
		System.out.println(bmw.milage);
		System.out.println(bmw.cost);

	}

}
