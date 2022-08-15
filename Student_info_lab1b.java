package LAB1_B;
import java.util.*;

public class Student_info_lab1b {
	String name,add,ph_no,email,branch;
	double ad_fee,tution_fee,branch_fee,total_fee;
	static String cname,cadd,cphone;
	static{
		cname="rvce";
		cadd="kengeri";
		cphone="7043092004";
	}
	Student_info_lab1b(String name,String add,String ph_no,String email){
		this.name=name;
		this.add=add;
		this.ph_no=ph_no;
		this.email=email;
		
	}
	Student_info_lab1b(String name,String add){
		this.name=name;
		this.add=add;
	}
	double fee_calc(String branch) {
		this.ad_fee=25000;
		this.tution_fee=15000;
		if(branch.equalsIgnoreCase("CS")) {
			this.branch_fee=10000;
		}
		else if(branch.equalsIgnoreCase("ME")) {
			this.branch_fee=20000;
		}
		else if(branch.equalsIgnoreCase("BE")) {
			this.branch_fee=30000;
		}
		else {
			this.branch_fee=50000;

		}
		this.total_fee=this.ad_fee+this.tution_fee+this.branch_fee;
		return this.total_fee;
		
	}
	void display() {
		System.out.println("--------STUDENT INFORMATION-----------");
		System.out.println("Student Name : " + this.name);
		System.out.println("Student Address : " + this.add);
		System.out.println("Student Contact : " + this.ph_no);
		System.out.println("Student Email ID : " + this.email);
	}
	void display(String branch) {
		double total=this.fee_calc(branch);
		System.out.println("Total FEE OF BRANCH " + this.branch +" is "+total);
		
	}
	void display (int field) {
		System.out.println("College Name : " + cname);
		System.out.println("College Address : " + cadd);
		System.out.println("College Phone No : " + cphone);
		if(field==5) {
			System.out.println("Student NAME : "+this.name);
			System.out.println("Student Address  :" +this.add);
		}
	}
	public static void main(String args[]) {
		Scanner s1=new Scanner(System.in);
		Student_info_lab1b std;
		System.out.println("Enter the student information : ");
		System.out.println("Enter the Student name : ");
		String name=s1.next();
		System.out.println("Enter the student address : ");
		String add=s1.next();
		System.out.println("Would like to enter email and phone no if yes the press 1");
		int ch=s1.nextInt();
		if(ch==1) {
			System.out.println("Enter the phone no : ");
			String ph_no=s1.next();
			System.out.println("Enter the email : ");
			String email=s1.next();
			std=new Student_info_lab1b(name,add,ph_no,email);
		}
		else {
			std=new Student_info_lab1b(name,add);
		}
		System.out.println("----------Dispaly otpion-------");
		System.out.println("1.Dispaly al the details : ");
		System.out.println("2.Dispaly total branhc fees : ");
		System.out.println("3.Display selected fields : ");
		int ch1=s1.nextInt();
		
		if(ch1==1) {
			std.display();
		}
		else if(ch1==2) {
			System.out.println("Enter the branch : ");
			String branch=s1.next();
			std.display(branch);
		}
		else if(ch1==3) {
			System.out.print("Enter the No of Fields (3 or 5) to display : ");
			int field=s1.nextInt();
			std.display(field);
		}
		else {
			System.out.println("Wrong choice");
		}
		s1.close();
		
	}
}