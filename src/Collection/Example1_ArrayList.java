package Collection;

import java.util.ArrayList;

public class Example1_ArrayList {
public static void main(String[] args) {
	ArrayList ar = new ArrayList();
	ar.add("kuldeep");
	ar.add(null);
	ar.add('A');
	ar.add(423);
	ar.add(78.2f);
	ar.add(null);
	ar.add("kuldeep");
	
	System.out.println(ar);
	System.out.println(ar.get(2));
}
}
