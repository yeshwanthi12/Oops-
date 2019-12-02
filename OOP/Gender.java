package OOP;

interface Human
{
public abstract void legs();
public abstract	void eyes();
public abstract	void hair();
}
class Gender implements Human
{

public void legs()
{
	int legs=2;
	System.out.println("legs is " +legs);
}
public void eyes()
{
int eyes=2;
System.out.println("eyes is " +eyes);
}
public void hair()
{
String hair="long";
System.out.println("hair is " +hair);
}
public static void main(String args[])
{
	Gender h=new Gender();
	h.legs();
	h.eyes();
	h.hair();
}
}



	
	
	
	
	

	


