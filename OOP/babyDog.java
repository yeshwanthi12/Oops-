package OOP;

class Animal
{
	public void eat()
	{
		System.out.println("eating");
	}
}
class Dog extends Animal	
{
public void sleep()
	{
		System.out.println("sleeping");
	}
}
class babyDog extends Dog
{
	public void bark()
	{
		System.out.println("barking");
	}
	public static void main(String args[])
	{
		babyDog o=new babyDog();
		o.eat();
		o.sleep();
		o.bark();
	}
}
	



	

