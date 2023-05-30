package practice;

public class constructor3 {

	int num1;
	int num2;
	int num3;
	constructor3(int a, int b, int c)
	{
		num1=a;
		num2=b;
		num3=c;
		
	}
	constructor3(int a,int b)// constructor overload
	{
		num1=a;
		num2=b;
	}
	public void m1()
	{
	System.out.println(num1+num2);	
	}
	public void m2() 
	{
	System.out.println(num1+num2+num3);	
	}
	public static void main(String[] args) {
		constructor3 s= new constructor3(23,22,2);
		s.m1();
	}
	
	
	
	
}
