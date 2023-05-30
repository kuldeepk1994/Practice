package Collection;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class example3_LinkedList {
public static void main(String[] args) {
	
	 
	 LinkedList l1 = new LinkedList();
	 l1.add("kuldeep");
	 l1.add("gangu");
	 l1.add("kuldeep");
	 l1.add('A');
	 l1.add(76.2f);
	 l1.add(876);
	 l1.add(null);
	 l1.add(null);
	 System.out.println(l1);
	 System.out.println(l1.size());
	 l1.add(1,"pradeep");
	 System.out.println(l1);
	 
	
}
}
