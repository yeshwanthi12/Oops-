package OOP;

interface Mobile
{
	 void storage();
	 void camera();
	 void Ram();
	
	}
 class Coolpad implements Mobile
{
	public void storage()
	{
		String storage="64gb";
		System.out.println("storage is:"+storage);
		}
	
	public void camera()
	{
		String camera="8px";
	System.out.println("camera is:"+camera);
	}
	
	
     public void Ram()
		{
	String ram="4gb";
	System.out.println("ram is:"+ram);
		}

}
 class Redmi implements Mobile
{
	public void storage()
	{
		String storage="128gb";
		System.out.println("storage is:"+storage);
		}
	
	public void camera()
	{
		String camera="8px";
	System.out.println("camera is:"+camera);
	}
	
	
     public void Ram()
		{
	String ram="4gb";
	System.out.println("ram is:"+ram);
		}


public static void main(String args[])
{
    
   Redmi b=new Redmi();
    b.storage();
    b.camera();
    b.Ram();
   Coolpad c=new Coolpad();
   c.storage();
   c.camera();
   c.Ram();
   
}

	
}






     
      
      
							
				

		
		
		
	 


