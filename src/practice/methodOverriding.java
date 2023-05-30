package practice;

public class methodOverriding {

public void m1()
{
System.out.println("Running non static method m1");	
}
public static void m2()
{
	System.out.println("Running static method m2");
}


public static void main(String[] args) {
	
	methodOverriding.m2();
	
	methodOverriding s = new methodOverriding();
	s.m1();
}
}
