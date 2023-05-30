package logical;

public class example_SwapeTwoNumbersWithoutThirdVariable {
public static void main(String[] args) {
	int num1= 33;
	int num2=65;
	System.out.println("Without Swape");
	System.out.println(num1);
	System.out.println(num2);
	System.out.println("With Swape");
	num1=num1+num2;
	num2=num1-num2;//33
	num1=num1-num2;//65
	System.out.println(num1);
	System.out.println(num2);
	
}
}
