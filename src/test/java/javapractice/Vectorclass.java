package javapractice;

import java.util.*;

public class Vectorclass {

	public static void main(String[] args) {
	 Vector<String> v1 = new Vector< >();
	 v1.add("one");
	 v1.add("two");
	 v1.add("tree");
	 v1.add("four");
	 v1.add("five");
	 v1.add("six");
	 v1.add("seven");
	 v1.add("eight");
	 v1.add("nine");
	 v1.add("Ten");	                        
	 v1.add("leven");
	 v1.add("twolve");
	 
  Vector<String> v2 = new Vector< >();
   v2.add("thirteen");
   v2.add("fourteen");
   v2.add("fifteen");
   v2.add("sixteen");
   
   Vector<String> v3 = new Vector< >();
   v3.add("seventeen");
   v3.add("eithteen");
   
 /*  for(int i=0;i<v2.size();i++) {
	   v1.add(v2.get(i));                  
   }
  System.out.println(v1); */
   
 // direct method 
   v1.addAll(v2);
   v1.addAll(v3);
   
// Retrieve element from list
 //  System.out.println(v1.get(4));     // by using index retrieve value
//   System.out.println(v1.contains("seven"));   // true 
//   System.out.println(v1.contains("twenty")); // false
  // remove five in index4 see the result 
   
 /*  v1.remove("five");
   System.out.println(v1);
   System.out.println(v1.get(4)); */
 
   //remove all in v2
  /* v1.removeAll(v2);
   System.out.println(v1);*/
   
 // update in list
    v1.set(3, "babu");
    System.out.println(v1);
   
 // remove all in list
   v1.clear();
   System.out.println(v1);
   
   
   
 System.out.println(v1);  
 System.out.println(v1.size());
 System.out.println(v1.capacity());

	
		
		
		

	}

}
