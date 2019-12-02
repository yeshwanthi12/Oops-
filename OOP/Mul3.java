package OOP;

 class Mul
{
public void add()
{
	System.out.println("adding");
}
}
class Mul2 extends Mul
{
	public void sub()
	{
		System.out.println("sutracion");
	}
	}
class Mul3 extends Mul2
{
	public void div()
	{
		System.out.println("division");
	}
	
public static void main(String args[])
{
	Mul3 o=new Mul3();
     o.div();
     o.sub();
     o.add();
     
     
}
}
