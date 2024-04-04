package javapractice;

public class ReverseStirng {

	public static void main(String[] args) {
		String str = "I am Babu";
        // Convert string to char array
        char[] charArray = str.toCharArray();
        
        // Iterate over the char array in reverse order and print each character
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }

	}

}
