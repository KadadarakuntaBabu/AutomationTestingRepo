package javapractice;

import java.util.LinkedHashSet;
import java.util.Set;
// identified by duplicate character
public class Practice {

 public static void main(String[] args) {
	String str="coconut";
	Set<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<str.length();i++) {
		set.add(str.charAt(i));
	}
	StringBuffer sb=new StringBuffer();
	for(Character c:set) {
		sb.append(c);
	}
	System.out.println(sb);
}
}