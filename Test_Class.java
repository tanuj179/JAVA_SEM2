package lab_2;
import java.util.Scanner;
public class Test_Class {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----MENU----");
		System.out.println("1. STAFF");
		System.out.println("2. STUDENT ");
		System.out.println("3. EXIT");
		
		while(true)
		{
			System.out.print("Enter your choice : ");
			int ch = sc.nextInt();
			
			if(ch==1)
			{
				System.out.print("Enter the Staff Name : ");
				String name = sc.next();
				
				System.out.print("Enter the Staff Address : ");
				String add = sc.next();
				
				System.out.print("Enter the Staff EmailId : ");
				String email = sc.next();
				
				System.out.print("Enter the Staff Phone Number : ");
				String phone = sc.next();
				
				System.out.print("Enter the Staff Employee ID : ");
				String empid = sc.next();
				
				System.out.print("Enter the Staff Company : ");
				String company = sc.next();
				
				System.out.print("Enter the Staff Designation : ");
				String desg = sc.next();
				
				System.out.print("Enter the Staff Salary : ");
				Double salary = sc.nextDouble();
				
				
				Staff s1 = new Staff(name, add, email, phone, empid, company, desg); 
				
				Double sal = s1.sal(salary);
				s1.display(s1);
				System.out.println("Staff Salary : "+sal);
				
				
			}
			else if(ch==2)
			{
				System.out.print("Enter the Student Name : ");
				String name = sc.next();
				
				System.out.print("Enter the Student Address : ");
				String add = sc.next();
				
				System.out.print("Enter the Student EmailId : ");
				String email = sc.next();
				
				System.out.print("Enter the Student Phone Number : ");
				String phone = sc.next();
				
				System.out.print("Enter the Student USN : ");
				String usn = sc.next();
				
				System.out.print("Enter the Student Branch : ");
				String branch = sc.next();
				
				System.out.print("Enter the Student Fees : ");
				Double fees = sc.nextDouble();
				
				Student stud = new Student(name, add, email, phone, usn, branch);
				Double fee = stud.calculate_fees(fees);
				stud.display(stud);
				System.out.println("Student Fees : "+fee);
			}
			else if(ch==3)
			{
				break;
			}
			else
				System.out.println("Invalid Choice");
		}
	}
}