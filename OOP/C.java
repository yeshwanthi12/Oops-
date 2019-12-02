package OOP;
 class P {
	public void m1()
	{
		System.out.println("print parent");
	}
 }

  class C extends P
{
	public void m1()
	{
		System.out.println("print child");
	}	
	public static void main(String args[])
	{
		C a = new C();
		a.m1();
}

}

