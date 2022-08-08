package lab_2;

public class Staff extends Person implements Staff_Op{
	String empid,company,desg;
	Staff(String name, String add, String email, String phone, String empid, String company, String desg)
	{
		super(name, add, email, phone);
		this.empid=empid;
		this.company=company;
		this.desg=desg;
	}
	
	@Override
	public Double sal(Double salary)
	{
		Double sal1 = salary + 10000;
		return sal1;
	}
}
