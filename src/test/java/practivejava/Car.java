package practivejava;

public class Car {
     String model;
     String colour;
     int     milage;
     int     cost;
     
 public  void startcar() {
	 System.out.println(model + "car started");
	  }
 public void stopcar() {
	 System.out.println(model + "car stoped");
         }
 public void cardetails() {
	 System.out.println("colour of car is"+ colour);
	 System.out.println("model of car is" +model );
	 System.out.println("milage of car is"+ milage);
	 System.out.println("cost of car is "+cost);
	 
 }
}
