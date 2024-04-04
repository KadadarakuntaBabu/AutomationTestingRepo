package javapractice;

import java.util.*;

public class Mappractiece {

	public static void main(String[] args) {
	//	List<Integer> ll = new LinkedList<>();
		
	Map<Integer, String> m = new HashMap<>	();
	  m.put(1," Babu");
	  m.put(2," mounika");
	  m.put(3," Hari");
	  m.put(4," sri ");
	  m.put(5," nandhu");
	  m.put(6," lakshimi ");
	  System.out.println(m);	
	  
	 Set<Integer> keys = m.keySet();
	  for(Integer key : keys) {
		  System.out.println(key);
	  }   
	  
	/*  Collection<String> values =m.values();
	  for(String valu: values) {
		  System.out.println(valu);
	  }
	  /*for(Integer key : keys) {
		  System.out.println(m.get(key));
	  }  */
   for(Integer key : keys) {
	   System.out.println(key + ">>>>>>>"+ m.get(key));
   }
	  
	  
	}

}
