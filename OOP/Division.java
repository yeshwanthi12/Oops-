package OOP;

public class Division {
 int num;
 int num1;
 int value;
  
 public void divisionNumbers() {
	 
  num=30;
  num1=22;
  value=num%num1;
  
 divisionOutput(value);
	
 }
 public void divisionOutput(int value) {
  System.out.println("value is=" +value); 
 }

 public static void main(String args[]) {
	 
	Division divObj=new Division();
	divObj.divisionNumbers();
	
 }
}
