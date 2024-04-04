package javapractice;

import java.io.*;

public class Filehandling {

	public static void main(String[] args) throws IOException {
		// create new file in mounikadocuments resume txt file
	/*	File f = new File("D:\\eclips ide novembr\\MounikaDoucuments//resume.txt");
		if(f.exists());
		   f.delete();
		System.out.println(f.createNewFile());  */
		
	// creare new folder in cuurrent project using "./"
		File f2 = new File(".\\Resources\\resume.txt");
		if(f2.exists());
		   f2.createNewFile();
		/*  System.out.println(f2.mkdir());
	    System.out.println(f2.createNewFile());
		System.out.println(f2.canRead());
		System.out.println(f2.canWrite());
		f2.setWritable(true);
		System.out.println(f2.canWrite());  */
      FileInputStream fis = new FileInputStream(f2);
         int asciicode;
         while((asciicode = fis.read())!=-1){
         System.out.print((char)asciicode);
         }

	fis.close();
			   
	}

}
