package practice;

public class multiLevelnheritance extends inheritance1{
public void bed() 
{
System.out.println("Bed : double");	
}
public void culler()
{
System.out.println("small culler");	
}
public static void main(String[] args) {
	multiLevelnheritance s= new multiLevelnheritance();
	s.money();
	s.home();
	s.car();
	s.mobile();
	s.lap();
	System.out.println("--self property--");
	s.bed();
	s.culler();
}
}
