package javamanideep;

public class JavaTask6 {
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
	void hasonlydigits(String data) {
		char[] a=data.toCharArray();
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>='0' && a[i]<='9') {
				c++;
			}
		}
		if(c==a.length)
			System.out.println("has only numbers");
		else
			System.out.println("not");
	}
	void validate10(String data) {
		char[] a=data.toCharArray();
		int c=0;;
		for(int i=0;i<a.length;i++) {
			if(a[i]>='0' && a[i]<='9')
			{
				c++;
			}
		}
		if(c==10)
		{
			System.out.println("string contains 10 digits");
		}
		else {
			System.out.println("string not contains 10 digits");
		}
	}
	void sort(int... x) {
		int[] a=new int[x.length];
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(x[i]>x[j]) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		for(int  k=0;k<a.length;k++)
		{
			System.out.println(x[k]);
		}
	}
	
	public static void main(String[] args) {
		JavaTask6 t=new JavaTask6();
		System.out.println(t.ReverseString("hello"));
		t.hasonlydigits("34232i");
		t.validate10("9090990890");
		t.sort(10,3,4,2,5,7,8,9);
		
	}

}
