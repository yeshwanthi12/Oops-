package OOP;

class Parent
{
	public void p1()
	{
	System.out.println("print parent class");
}
}
 class Derived extends Parent
{
	public void p2()
	{
	System.out.println("print child class");
}
public static void  main(String args[])
{
Derived o=new Derived();
	o.p1();
	o.p2();
}

}

			
	
	
	


