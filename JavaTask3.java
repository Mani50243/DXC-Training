package javamanideep;

public class JavaTask3 {
	String replaceFirst(String var,char find,char replace) {
		char[] arr=var.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==find && i==0)
			{
				arr[i]=replace;
			}
		}
		String mnstr=new String(arr);
		return mnstr;
		
	}
	String replaceLast(String var,char find,char replace) {
		char[] arr=var.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==find && i==arr.length-1)
			{
				arr[i]=replace;
			}
		}
		String mnstr=new String(arr);
		return mnstr;
		
	}
	boolean charsame(char a,char b)
	{
		if(a==b)
		{
			return true;
		}
		else if(a+32==b || a-32==b || b+32==a || b-32==a)
		{
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args)
	{
		JavaTask3 t=new JavaTask3();
		String data=t.replaceFirst("Test data",'T','%');
		String data1=t.replaceLast("Test data",'a','@');
		boolean w=t.charsame('a','A');
		
		System.out.println(data);
		System.out.println(data1);
		System.out.println(w);
		
	}

}
