package practice;

public class cos {
	int num1;
	int num2;
	int num3;
	
cos(){
	num1=23;
	num2=11;
	System.out.println(num1+num2);
}
cos(int a, int b)
{
	this();
	num1=a;
	num2=b;
	System.out.println(a+b);
}
cos(int a, int b, int c)
{
	this(11,12);
	num1=a;
	num2=b;
	num3=c;
	System.out.println(a+b+c);
}
public static void main(String[] args) {
	cos c1 = new cos(12,4,2);
	System.out.println(c1);
}
}
