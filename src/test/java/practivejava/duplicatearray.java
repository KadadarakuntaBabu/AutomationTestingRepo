package practivejava;

public class duplicatearray {

	public static void main(String[] args) {
		boolean flag=false;
		String arr[] = {"java","python","c++","java",};
		
		for(int i=0;i<arr.length;i++) {
		  
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("duplicate Element is identified:"+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("duplicate element is not identifyied");
		}
		}

	}


