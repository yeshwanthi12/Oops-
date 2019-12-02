//interface program
package OOP;

interface grandParents 
{
	void teach();
}
interface parents
{
	void teach();
}
interface child
{
	void teach();

}
class Babychild1 implements grandParents,parents,child
{
	public void teach()
	{
		System.out.println("Teaching");
		}
	public static void main(String args[])
	{
		grandParents g=new Babychild1();
				g.teach();
		
	}
}






