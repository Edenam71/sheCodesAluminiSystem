package Shecodes;

import java.util.Scanner;

/**This secondary class includes the methods: SetPassword, Addcourses, AddLinkedin, JobSearchStatus
 *
 */
public class SecondarySetUp {

	
	public String alumniID(String name, String lastName) {
		
		
		Scanner scan=new Scanner(System.in);
			
		System.out.println("Welcome to she codes! "+"Please enter your first name");
		
		String name1=scan.next();
		
		System.out.println("Please enter your last name, if your last name consists of more than one word, please combine the words");
		
		String lastName1=scan.next();
		
		System.out.println("Your username is "  );
		
		return name1+"."+lastName1+".shecodes";
		
	}

}
	

