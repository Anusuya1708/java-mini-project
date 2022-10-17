package project;
import java.util.Scanner;
public class StudentManagement {
		public void courseDetails(int choice)
		{
			switch(choice)
			{
			case 1: 
				System.out.println("1.Java Full Stack Developer"+ "\nCourse fees: Rs.5000" + "\nCourse duration: 3 months");
				break;
			case 2: 
				System.out.println("2.Python"+ "\nCourse fees: Rs.5000" + "\nCourse duration: 5 months");
				break;
			case 3: 
				System.out.println("3.Data Scientist"+ "\nCourse fees: Rs.5000" + "\nCourse duration: 6 months");
				break;
			case 4: 
				System.out.println("4.Frond end developer"+ "\nCourse fees: Rs.5000" + "\nCourse duration: 3 months");
				break;
			case 5: 
				System.out.println("5.Back end developer"+ "\nCourse fees: Rs.5000" + "\nCourse duration: 3 months");
				break;
				
			}
		}
		public void StudentDetails(String name, String address, long mobileno, String emailid)
		
		{
			System.out.println("Student Name: " +name + "\nLocation: " + address + "\nMobile No: " +mobileno
					+ "\nEmail Id: "+ emailid);
		
			
		}
		public void courseFees(double fees)
		{
			
			if(fees==5000)
			{
				System.out.println("You have completed Full payment. Happy Learning!");
			}
			else
			{
				double balance = 5000 - fees;
				System.out.println("You have paid Rs." +fees + " " + "balance amount to be paid is Rs." + balance);
			}
		}
		
		 public static void main(String [] args)
		 {
			 StudentManagement pro = new StudentManagement();
			 Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to Edubridge! The trending courses are: " + "\n1.Java Full Stack Developer" + "\n2.Python"
			 + "\n3.Data Scientist" + "\n4.Frond end developer" + "\n5.Back end developer");
			System.out.println("Enter you choice:");
			int choice = sc.nextInt();
			pro.courseDetails(choice);
			System.out.println("Enter your name:");
			 String name = sc.next();
			System.out.println("Enter your address:");
			 String address = sc.next();
			System.out.println("Enter your Mobile no:");
			 long mobileno = sc.nextLong();
			System.out.println("Enter your Email Id:");
			 String emailid = sc.next();
			 //sc.close();
			pro.StudentDetails(name,address,mobileno,emailid);
			System.out.println("Your course amount is Rs.5000/-");
			System.out.println("Please enter your payment:");
			 double fees = sc.nextDouble();
			
			pro.courseFees(fees);
		 }

	

	}


