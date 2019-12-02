package OOP;

abstract class Collage
{
	
	abstract void students();
	abstract void staff();
	abstract void classroom();
	}
class Engineering extends Collage
{
	void students()
	{
		String branch="cse";
		System.out.println("branch is:" +branch);
	}
	void staff()
	{
		String name="yeshu";
		System.out.println("name is:" +name);
	}
	void classroom()
	{
		int num=52;
		System.out.println("num is:" +num);
	}
	public static void main(String args[])
	{
		Collage c=new Engineering();
		c.students();
		c.staff();
		c.classroom();
	}
	
	
}


