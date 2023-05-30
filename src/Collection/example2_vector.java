package Collection;

import java.util.Vector;

public class example2_vector {
public static void main(String[] args) {
	 Vector vc = new Vector();
	 vc.add("kuldeep");
	 vc.add('k');
	 vc.add(null);
	 vc.add("kuldeep");
	 vc.add(null);
	 vc.add("kuldeep");
	 vc.add(98.3f);
	 vc.add(5353);
	 
	 System.out.println(vc);
	 System.out.println(vc.size());
}
}
