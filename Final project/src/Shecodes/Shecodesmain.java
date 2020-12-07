
package Shecodes;

import java.util.*;

public class Shecodesmain extends FirstSteps {

	public static void main(String[] args) {
		
		//declaring variables 
		
		
		Shecodesmain registerNewGrad = new Shecodesmain();
	
		Scanner scan=new Scanner(System.in);
				
		final int n=8; //length of password
		
		//output initial setup- OTP, username, initial resume. 
		
		System.out.println("Welcome to she codes! "+"Please enter your first name");
		
		String name=scan.next();
		
		System.out.println("Please enter your last name, if your last name consists of more than one word, please combine the words");
		
		String lastName=scan.next();
		
		System.out.println("Your username is "+ registerNewGrad.alumniID(name, lastName));
		
		System.out.println("Your password is "+ registerNewGrad.getAlphaNumericString(n));
		
		System.out.println("You have completed the following courses: " );
		System.out.println(registerNewGrad.resume());
		
		
		
		//output secondary setup
		System.out.println("Please enter your password");
		String password= scan.next();
		
		
		//adding courses
		System.out.println("If you want to add more course to your resume, please enter number 1, to continue enter any other number");
		
		int changeresume= 1;
		
		int userinput=scan.nextInt();
		
		
		
		if(userinput==changeresume) {
			
			System.out.println("Please enter the course your would like to add:");
			
			String morecourse=scan.next();
			
			
		}
		
		//adding linkedin page
		
		System.out.println("If your want to add your Linkedin page, please enter number 2, to continue enter any other numer ");
		
		int addlinkedin=2;
		
		int userinput2= scan.nextInt();
		
		if (userinput2==addlinkedin) {
			
			System.out.println("Please enter your linkedin page");
			
			String linkedinpage= scan.next();
			
		}
		
		//adding job search status
		
		System.out.println("If you're not looking for a new job please enter 1"
				+ " if you are not looking for a new job but open for suggestions please enter 2"
				+ " if you are looking for a new job please enter 3");
		
		int useroutput3= scan.nextInt();
		
		switch (useroutput3) {
			
			case 1:
				String jobsearchstatus= "Not looking for a new job";
				
				System.out.println("Your job search status is: " +jobsearchstatus);
				
				break;
				
			case 2:
				jobsearchstatus="Not looking for a new job but open for suggestions";

				System.out.println("Your job search status is: " +jobsearchstatus);
				
				break;
				
			case 3:
				
				jobsearchstatus= "Looking for a new job";

				System.out.println("Your job search status is: " +jobsearchstatus);
				
				break;
				
					
		}
		
		//shoudjoboffer
		
		System.out.println("Assesing whether you should be offered a new job");
		System.out.println(registerNewGrad.shouldOfferJob(userinput));


		
		
	}

}
