package Books;

import java.util.Scanner;

public class book {
 String name;
 String city;
 int contact_no;
 String email_id;
   
 
 void readData() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the name ");
	 name=sc.next();
	 System.out.println("Enter the city ");
	 city=sc.next();
	 System.out.println("Enter the contact number ");
	 contact_no=sc.nextInt();
	 System.out.println("Enter the email id ");
	 email_id=sc.next();
	 
 }
  void displayData() {
	  System.out.println(name+" "+city+" "+contact_no+" "+email_id);
  }
   

}