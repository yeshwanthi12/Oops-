package OOP;

public class vehicle 
{
public void car(String carName,int carNum)
{
	System.out.println("carName=" +carName);
	System.out.println("carNum=" +carNum);

}
public void car(String CarName,String Brand)
{
	System.out.println("carName=" +CarName);
	System.out.println("Brand=" +Brand);

	{
}
}
public static void main(String args[])
{
	vehicle o=new vehicle();
	vehicle o1=new vehicle();
	o.car("BMW",123);
	o1.car("audi","dfgh");
}
}

	





