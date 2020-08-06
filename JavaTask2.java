package javamanideep;

public class JavaTask2 {
	public static void main(String[] args)
	{
		int c=Integer.parseInt(args[0]);
		for(int i=1;i<=10;i++)
		{
			System.out.println(c+"*"+i+"="+c*i);
		}
		char a='A';
		for(int j=0;j<26;j++)
		{
			System.out.println(a);
			a++;
		}
		
		int x=1234;
		int y;
		while(x>0)
		{
			
			y=x%10;
			System.out.println(y);
			x=x/10;
		}
		
		int k=Integer.parseInt(args[1]);
		int p,ct=0;
		while(k>0)
		{
			
			p=k%10;
			if(p==0)
			{
				ct++;
			}
			k=k/10;
		}
		
		System.out.println(ct+" zeros");
		
		int w=Integer.parseInt(args[2]);
	    ct=0;
	    p=0;
		while(w>0)
		{
			p=w%10;
			if(p==0)
			{
				ct++;
			}
			else {
				break;
			}
			w=w/10;
		}
		System.out.println(ct+"zeros");

		
	}

}
