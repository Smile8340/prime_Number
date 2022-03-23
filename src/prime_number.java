
public class prime_number {

	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		int count =0;
		for(int i=2; i<=n/2; i++)
		{
			if(n%i == 0)
			{
				count=1;
			}
		}
		if(count==0)
		{
			System.out.println(+n +": This Number is prime");
		}
		else
		{
			System.out.println(+n  +" :- This Number is non prime");
		}
		// TODO Auto-generated method stub

	}

}
