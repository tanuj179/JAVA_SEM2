package LAB1_A;

import java.util.Scanner;

public class StudentInfo {
	String name,add,email,branch;
	int ph_no;
	double tfees,ad_fee,tution_fees,bran_fees,fee1;
	public void student_Details(String name,String add,int ph_no,String email,String branch) {
		this.name=name;
		this.add=add;
		this.ph_no=ph_no;
		this.email=email;
		this.branch=branch;
		
		System.out.println("Student name :"+this.name);
		System.out.println("Student address : "+this.add);
		System.out.println("Student phone no : "+this.ph_no);
		System.out.println("Student email id : "+this.email);
		System.out.println("Student branch : "+this.branch);
		
	}
	
	public double fee(double ad_fee, double tution_fees, double bran_fees, double fee1) {
		this.ad_fee = ad_fee;
		this.tution_fees = tution_fees;
		this.fee1 = fee1;
		tfees = ad_fee+tution_fees+fee1;
		tfees+= bran_fees;
		return tfees;
	}
	
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			StudentInfo std=new StudentInfo();
			System.out.println("Enter the stduent details");
			System.out.println("Enter the student name");
			String name=sc.next();
			System.out.println("Enter the address");
			String add=sc.next();
			System.out.println("Enter the ph_no");
			int ph_no=sc.nextInt();
			System.out.println("Enter the email id");
			String email=sc.next();
			System.out.println("Enter the branch");
			String branch=sc.next();
			
			std.student_Details(name, add, ph_no, email,branch);
			System.out.println("Enter the admission fees");
			double ad_fee=sc.nextDouble();
			System.out.println("Enter the tution fees");
			double tution_fees=sc.nextDouble();
			System.out.println("Enter the branch fees");
			double bran_fees=sc.nextDouble();
			System.out.println("enter the Internet fee");
			double fee1 = sc.nextDouble();
			
			double tfee = std.fee(ad_fee,tution_fees,bran_fees,fee1);
			 System.out.println("-----------------------");
				System.out.println("total fees for the student is: "+tfee);
		        System.out.println("-----------------------");
	}
}