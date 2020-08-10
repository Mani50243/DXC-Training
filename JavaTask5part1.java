package javamanideep;

public class JavaTask5part1 {
	int o,e,d;
	int sum(int... x)
	{
		int max=x[0],min=x[0],s=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>max)
			{
				max=x[i];
			}
			if(x[i]<min)
			{
				min=x[i];
			}
			if(x[i]%3==0 && x[i]!=0)
			{
				d++;
			}
			if(x[i]%2==0)
			{
				e++;
			}
			else {
				o++;
			}
			s=s+x[i];
			
		}
		System.out.println("min value is "+min);
		System.out.println("max value is "+max);
		System.out.println("no of elements divisible by 3 are "+d);
		System.out.println("no of odd numbers "+o);
		System.out.println("no of even numbers "+e);
		
		return s;
	}
	public static void main(String[] args) {
		JavaTask5part1 p=new JavaTask5part1();
		System.out.println(p.sum(10,7,2,4,1,8,9));
	}

}
