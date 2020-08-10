package javamanideep;

public class JavaTask4 {
	String x="yes";
	String y="no";
	String hasUpper(String data)
	{
		char[] a=data.toCharArray();
		int k=0;
		int p=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=65 && a[i]<=90)
			{
				k++;
			}
			else {
				p++;
			}
		}
		if(k>0)
		{
			return x;
		}
		else {
			return y;
		}
		
	}
	String isNum(String data) {
		
		char[] m=data.toCharArray();

		int c=0;
		int d=0;
		for(int i=0;i<m.length;i++)
		{
			if(m[i]>='0' && m[i]<='9')
			{
				c++;
			}
			else {
				d++;
			}
		}
		if(c>0)
		{
			return x;
		}
		else {
			return y;
		}
	}
		public static void main(String[] args)
		{
			JavaTask4 t1=new JavaTask4();
			String e=t1.hasUpper("manIdeep");
			System.out.println(e);
			String e1=t1.isNum("Mani243");
			System.out.println(e1);
			
		}
	

}
