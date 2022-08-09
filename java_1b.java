//System.out.println();
//System.out.print();
package java_lab_1b;
import java.util.*;

public class java_1b {
	String sname, sadd, sbranch, sphoneno, semailid;
	double ad_fee, branch_fee, tution_fee, total_fees;
	static String cname,cadd,cphoneno;
	static
	{
		cname = "RVCE";
		cadd = "Pattanagere, Kengeri";
		cphoneno = "8794641220";
	}
	
	java_1b(String sname, String sadd, String sphoneno, String semailid)
	{
		this.sname = sname;
		this.sadd = sadd;
		this.sphoneno = sphoneno;
		this.semailid = semailid;
	}
	
	java_1b(String sname, String sadd)
	{
		this.sname = sname;
		this.sadd = sadd;
	}
	
	double fees_calculation(String sbranch)
	{
		this.ad_fee = 25000;
		this.tution_fee = 10000;
		if(sbranch.equalsIgnoreCase("CS"))
			this.branch_fee = 5000;
		else if(sbranch.equalsIgnoreCase("E&C"))
			this.branch_fee = 10000;
		else if(sbranch.equalsIgnoreCase("E&E"))
			this.branch_fee = 15000;
		else
			this.branch_fee=1000;
		
		
			
		this.total_fees = this.ad_fee + this.tution_fee + this.branch_fee;
		
		return this.total_fees;
	}
	
	public void display()
	{
		System.out.println("--------STUDENT INFORMATION-----------");
		System.out.println("Student Name : " + this.sname);
		System.out.println("Student Address : " + this.sadd);
		System.out.println("Student Contact : " + this.sphoneno);
		System.out.println("Student Email ID : " + this.semailid);
	}
	
	public void display(String sbranch)
	{
		double fees_calc = this.fees_calculation(sbranch);
		System.out.println("Total Fees of Branch : " + this.sbranch + "is : " + fees_calc);
	}
	
	public void display(int fields)
	{
		
		System.out.println("College Name : " + cname);
		System.out.println("College Address : " + cadd);
		System.out.println("College Phone No : " + cphoneno);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
//		java_1b si;
		while(true)
		{
			System.out.println("Enter the student Information");
			System.out.println("-----------------------------");
			
			System.out.print("Enter the Student Name : ");
			String sname = sc.next();
			
			System.out.print("Enter the Student Address : ");
			String sadd = sc.next();
			
			System.out.print("Would you like to enter Email ID and Phone No (1=Yes) : ");
			int ch = sc.nextInt();
			
			if (ch==1)
			{
				System.out.print("Enter the Student Phone Number : ");
				String sphoneno = sc.next();
				
				System.out.print("Enter the Student Email ID : ");
				String semailid = sc.next();
				
				java_1b si = new java_1b(sname, sadd,sphoneno, semailid);	
			}else {
				
				java_1b si = new java_1b(sname, sadd);
			}
			
			
			System.out.println("-------------DISPLAY OPTIONS-----------------");
			System.out.println("1. Display all Details");
			System.out.println("2. Display total Branch Fees");
			System.out.println("3. Display Selected Fields");
			int ch1 = sc.nextInt();
			
			if(ch1==1)
				si.display();
			else if(ch1==2)
			{
				System.out.println("Enter Student Branch : ");
				String sbranch = sc.next();
				
				si.display(sbranch);
			}
			else if(ch1 == 3)
			{
				System.out.print("Enter the No of Fields (3 or 5) to display : ");
				int fields = sc.nextInt();
				si.display(fields);
			}
			else
				System.out.println("Wrong Choice");
			
		}
		sc.close();
	}
}
