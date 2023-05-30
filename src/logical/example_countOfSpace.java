package logical;

public class example_countOfSpace {
public static void main(String[] args) {
	 String name = "my name is kuldeep";
	 int count =0;
	 for(int i=0; i<=name.length()-1;i++)
	 {
		 
		 if(name.charAt(i)==' ')
		 {
			 count++;
			 
		 }
	 }System.out.println(count);
}
}
