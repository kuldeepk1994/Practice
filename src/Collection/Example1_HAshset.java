package Collection;

import java.util.HashSet;

public class Example1_HAshset {
public static void main(String[] args) {
	 HashSet hs =new HashSet();
	 hs.add("kuldeep");
	 hs.add('A');
	 hs.add(524);
	 hs.add(76.2f);
	 hs.add("kuldeep");
	 hs.add(null);
	 hs.add(null);
	 
	 System.out.println(hs);
}
}
