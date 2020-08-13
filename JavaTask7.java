package javamanideep;

public class JavaTask7 {
	String ReverseString(String data)
	{
		char[] a=data.toCharArray();
		char[] b=new char[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[j]=a[i];
			j++;
		}
		String st=new String(b);
		return st;
	}
	String LowerCase(String data) {
		char[] a=data.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=65 && a[i]<=90)
			{
				a[i]=(char)(a[i]+32);
			}
		}
		String s=new String(a);
		return s;
	}
	String UpperCase(String data) {
		char[] a=data.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=97 && a[i]<=122)
			{
				a[i]=(char)(a[i]-32);
			}
		}
		String s=new String(a);
		return s;
	}
	String UpperLower(String data) {
		char[] a=data.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=97 && a[i]<=122)
			{
				a[i]=(char)(a[i]-32);
			}
			else if(a[i]>=65 && a[i]<=90)
			{
				a[i]=(char)(a[i]+32);
			}
		}
		String s=new String(a);
		return s;
	}
	String ReverseMakeUpper(String data)
	{
		char[] a=data.toCharArray();
		char[] b=new char[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[j]=a[i];
			if(a[j]>=65 && a[j]<=90)
			{
				if(b[j]>=97 && b[j]<=122)
				{
					b[j]=(char)(b[j]-32);
				}
			}
			if(a[j]>=97 && a[j]<=122)
			{
				if(b[j]>=65 && b[j]<=90)
				{
					b[j]=(char)(b[j]+32);
				}
			}
			
			j++;
		}
		String st=new String(b);
		return st;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaTask7 t=new JavaTask7();
		System.out.println(t.ReverseString("Hello"));
		System.out.println(t.LowerCase("HellO"));
		System.out.println(t.UpperCase("HellO"));
		System.out.println(t.UpperLower("Hello"));
		System.out.println(t.ReverseMakeUpper("HeLloWorld"));
		
		

	}

}
