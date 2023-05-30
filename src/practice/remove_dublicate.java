package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class remove_dublicate {
public static void main(String[] args) {
	String s= "kuldeepkushwaha";
	int count;
	
	
	LinkedHashSet hs = new LinkedHashSet();
	
	for(int i=0; i<=s.length()-1; i++)
	{
		char data = s.charAt(i);
		hs.add(data);
	}
	System.out.println(hs);
}
}
