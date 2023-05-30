package logical;

import java.util.LinkedHashSet;

public class example_removeDuplicateNumber {
public static void main(String[] args) {
	String name= "kuldeepkushwaha";
	
	LinkedHashSet s= new LinkedHashSet();
	for(int i=0; i<=name.length()-1; i++)
	{
		char data = name.charAt(i);
		s.add(data);
	}
			System.out.println(s);
}
}
