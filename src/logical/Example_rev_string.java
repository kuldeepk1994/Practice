package logical;

public class Example_rev_string {
public static void main(String[] args) {
	String org = "kuldeep";
	String rev= "";
	for(int i=org.length()-1; i>=0; i--)
	{
		rev=rev+org.charAt(i);
	}System.out.println(rev);
}
}
