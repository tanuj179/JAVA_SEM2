package lab_2;

public class Student extends Person implements Student_OP{
	String usn,branch;
	Student(String name, String add,String email, String phone, String usn, String branch)
	{
		super(name, add, email, phone);
		this.usn=usn;
		this.branch=branch;
	}
	
	@Override
	public Double calculate_fees(Double fee)
	{
		double fees = fee + 1000;
		return fees;
	}
	
	
}
