package practice;

public class methodOverload {
public void m1(int a, int b, int c)
{
	System.out.println(a+b+c);
}
public void m1(int a, int b)
{
System.out.println(a+b);	
}
public static void main(String[] args) {
	methodOverload s =new methodOverload();
	s.m1(21, 1);
	System.out.println("------");
	s.m1(1, 5, 3);
}
}
