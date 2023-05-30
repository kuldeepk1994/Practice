package logical;

public class example_countOfCharInString {
public static void main(String[] args) {
	String s= "kuldeepkushwahak";
	int count =0;
	for(int i=0; i<=s.length()-1; i++)
	{
		if(s.charAt(i)=='k')
		{
			count++;
			
		}
	}System.out.println(count);
}
}
