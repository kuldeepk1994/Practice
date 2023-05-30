package practice;

public class methodOverriding1 extends inheritance {

	public void car()
	{ // method override
	System.out.println("car : KIA");	
	}
	public void home()
	{// method override
	System.out.println("home : 1BHK");	
	} 
	public static void main(String[] args) {
		methodOverriding1 s= new methodOverriding1();
		s.car();
		s.home();
		s.money();
		
	}
	
	
}
