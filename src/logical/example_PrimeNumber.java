package logical;

public class example_PrimeNumber {
public static void main(String[] args) {
	//prime 2 to 50
	for(int i=2; i<=50; i++)
	{
		int temp = 0;
	
		for(int j=2; j<=i; j++)
		{
			if(i%j==0)
			{
				temp++;
			}
			
		}
		if(temp==i);
		{
			System.out.println(i);
		}
	}
}
}
