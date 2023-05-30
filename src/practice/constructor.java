package practice;

public class constructor {

	int num1;
	int num2;
	constructor(){
		num1=20;
		num2=12;
	}
	public void m1()
	{
	System.out.println(num1+num2);	
	}
	public static void main(String[] args) {
		constructor s= new constructor();
		s.m1();
				
	}
	
	
}
