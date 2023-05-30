package practice;

public class constructor2 {
int num1;
int num2;
int num3;

constructor2(int a, int b, int c){
	num1=a;
	num2=b;
	num3=c;
	
}
public void m1()
{
System.out.println(num1+num2+num3);	
}
public static void main(String[] args) {
	constructor2 s= new constructor2(2, 34, 5);
	s.m1();
}


}
