package OOP;

class Company
{
public void display()
{
	System.out.println("TCS company");
}
}
class Employee extends Company
{
	String empName;
	int empId;
	float sal;
	Employee(String empName,int empId,float sal){
		this.empName=empName;
		this.empId=empId;
		this.sal=sal;
	}
public void work()
{
	System.out.println("empName:"+ empName);
	System.out.println("empid:"+ empId);
	System.out.println("sal:"+ sal);
	System.out.println("software developer");
}
public static void main(String args[])
{
	
    Employee a=new Employee("yashu",5,50000);
	a.display();
	a.work();
	
}
}

