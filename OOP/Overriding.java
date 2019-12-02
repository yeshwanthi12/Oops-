//example of overriding with static variable
package OOP;

 class Subtration
{


static int num1=66;
public void sum()
{
	
	int num2=10;
	int result;
	System.out.println("result:" +(num1-num2));
}
}
class  Overriding extends Subtration
{
public void sum1()
{
	
	int num2=10;
	int result;
	System.out.println("result:" +(num1-num2));
}
public static  void main(String args[])
{
	Overriding o=new Overriding();
	o.sum1();
System.out.println(num1);
}

			
}




