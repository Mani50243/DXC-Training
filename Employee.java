package javamanideep;

public class Employee {
	int empid;
	String empname;
	int enumr;
	String eemail;
	String elocation;
	void init() {
	    empid=101;
	    empname="manideep";
		enumr=929292134;
		eemail="mani@gmail.com";
		elocation="banglore";
	}
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(enumr);
		System.out.println(eemail);
		System.out.println(elocation);
	}
	public static void main(String[] args)
	{
		Employee e=new Employee();
		Employee e1=new Employee();
		e.init();
		e.display();
		e1.display();
	}

}
