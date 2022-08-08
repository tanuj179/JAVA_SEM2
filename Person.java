package lab_2;

public class Person {
	String name, add, email, phone;
	Person(String name, String add, String email, String phone)
	{
		this.name = name;
		this.add = add;
		this.email = email;
		this.phone = phone;	
	}
	
	void display(Object o)
	{
		if(o instanceof Staff s1)
		{
			System.out.println("Staff Name : "+this.name);
			System.out.println("Staff Address : "+this.add);
			System.out.println("Staff Email : "+this.email);
			System.out.println("Staff Phone : "+this.phone);
			System.out.println("Staff Emp ID : "+s1.empid);
			System.out.println("Staff Company : "+s1.company);
			System.out.println("Staff Designation : "+s1.desg);
			
		}
		else if(o instanceof Student stud)
		{
			System.out.println("Student Name : "+this.name);
			System.out.println("Student Address : "+this.add);
			System.out.println("Student Email : "+this.email);
			System.out.println("Student Phone : "+this.phone);
			System.out.println("Student USN : "+stud.usn);
			System.out.println("Student Branch : "+stud.branch);
		
		}
	}
}

