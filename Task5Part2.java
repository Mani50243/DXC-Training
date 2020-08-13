package javamanideep;

public class Task5Part2 {
	String SubString(String data,int index) {
		char[] a=data.toCharArray();
		int k=a.length-index;
		char[] b=new char[k];
		int j=0;
		for(int i=index;i<a.length;i++)
		{
			b[j]=a[i];
			j++;
			
		}
		String out=new String(b);
		return out;
	}
	String SubString(String data,int index,int index1) {
		char[] c=data.toCharArray();
		int k=c.length-(index1-index+1);
		char[] d=new char[k];
		int j=0;
		for(int i=0;i<c.length;i++)
		{
			if(i>=index && i<=index1)
				continue;
			d[j]=c[i];
			j++;
			
		}
		String out=new String(d);
		return out;
		
	}
	void countRepeat(String data)
	{
		char[] a=data.toCharArray();
		int ct1=0,ct=0;
		char b=' ';
		for(int i=0;i<a.length;i++) {
			ct=0;
			for(int j=i;j<a.length;j++) {
				if(a[i]==a[j])
				{
					ct++;
				}
				
			}
			if(ct>ct1)
			{
				ct1=ct;
				b=a[i];
				
			}
			
		}
		System.out.println(ct1+" "+b);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task5Part2 t=new Task5Part2();
		System.out.println(t.SubString("hello world" , 3));
		System.out.println(t.SubString("hello world" , 1,4));
		t.countRepeat("helloworldddddddd");
		

	}

}
