package OOP;

class Student 
{
public void read()
{
	System.out.println("reading");
}
}
class Student1 extends Student
{
	public void write()
	{
		System.out.println("writing");
	}
	}
class Student2 extends Student
{
	public void study()
	{
		System.out.println("studying");
	}
public static void main(String args[])
{
	Student2 o=new Student2();
     o.read();
    o.study();
	
}
}


	
	



