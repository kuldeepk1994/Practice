package logical;

public class example_mainMethodOverLoad {
public static void main(String[] args) {
	System.out.println("main method with string datatype");
}
public static void main(float[] args) 
{
	//here main method overloaded with float datatype but copiler will run
	//only String main method
System.out.println("main method with float datatype");	
}
}
