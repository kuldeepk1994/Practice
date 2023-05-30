package practice;

public class inheritance1 extends inheritance{
public void mobile() 
{
System.out.println("Mobile : 1+");	
}
public void lap()
{
System.out.println("Lap : hp");	
}
public static void main(String[] args) {
	inheritance1 s = new inheritance1();
	System.out.println("--super class property--");
	s.car();
	s.money();
	s.home();
	System.out.println("--self property---");
	s.mobile();
	s.lap();
			
}
}
