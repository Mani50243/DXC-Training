package javamanideep;

public class AddNUMS {
	public static void main(String[] args)
	{
		System.out.println(args[0] + args[1]);
		int c=10;
		System.out.println(c + Integer.parseInt(args[1]));
		char a='i';
		if((a>=65 && a<=90) || (a>=97 && a<=122))
		{
			if((a>=65 && a<=90))
			{
				System.out.println("Capital");
			}
			else {
				System.out.println("small");
			}
		}
		else {
			System.out.println("invalid argument");
			
		}
		
		
		int p=Integer.parseInt(args[2]);
		if(p%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
		
		
		int d=Integer.parseInt(args[3])*77;
		System.out.println(d+"dolors");
		
		
		
		
			
			
	}

}
