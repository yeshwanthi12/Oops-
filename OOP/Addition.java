package OOP;

public class Addition {
 int num1;
 int num2;
 int result;
 
 public void add(int num1,int num2) {
   
	 result=num1+num2;
	 System.out.println("Result is:" + result); 
 } 
 public static void main(String args[]) {
	Addition addObj=new Addition();
	addObj.add(20, 10);
 }	
}




	


