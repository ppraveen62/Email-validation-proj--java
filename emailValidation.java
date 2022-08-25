package L2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface Emails{
	//employee email id's
	String[] emailId= {"praveen@gmail.com","ravi65@gmail.com","kiran@yahoo.com","kk_321@gmail.com"};
}

public class emailValidation implements Emails {
	static void sreachId(String id) {
		int count=0;
		for(String x: emailId) {
		 Boolean sreach = Pattern.matches(id,x);
		 if(sreach==true) {
			 count+=1;
			 }
		 }
		if (count==1) {	
		System.out.println();
		System.out.println("Match found");
		System.out.println("yes, He or She is registerd Employee.");
		}else {
			System.out.println();
			System.out.println("check ID again ! or,");
			System.out.println("He/She is not registerd Employee.");
		}
}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Email Id: ");
		String id =sc.nextLine();
		sreachId(id);
		
		
	}

}
