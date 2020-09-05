package Week4.day1;
public class SamsungChild extends Mobileparent {
	
	public void getname()
	{
		System.out.println("Samsung");
	}
	//overrides method
	public void getSpecs()
	 {
		 System.out.println("Samsung specification");
	 }
	//overrides method 
	public boolean camerarear()
	 {
		 System.out.println("Samsung.....Camera rear");
		 return true;
	 }
	public void getname(String str)
	{
		System.out.println("Samsung overloads..." +str);
	}

}
