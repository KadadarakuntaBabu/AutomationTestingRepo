package javapractice;

public class example2 {

	public static void main(String[] args) {
	String str="Babu is a automation Testing";
	String[] words=str.split("\\s");
	String reverseword=" ";
	for(String w:words) {
		StringBuilder sb=new StringBuilder(w);
		sb.reverse();
		reverseword=reverseword+sb.toString()+" ";
		
	}
		System.out.println(reverseword);
	}
	

}
