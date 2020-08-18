package javamanideep;

class Tortoise implements Runnable{
	public void run(){
		for(int i=1;i<=100;i++)
		{
			System.out.println(Thread.currentThread().getName());
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
class Hare implements Runnable{
public void run(){
	for(int i=1;i<=100;i++)
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(i);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i==90) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
		
	}
	
}

public class BeginRace{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tortoise t=new Tortoise();
		Hare h=new Hare();
		Thread t1=new Thread(t,"Tortoise");
		Thread t2=new Thread(h,"Hare");
		t1.start();
		t2.start();
		/*while() {
			
		}*/
		while(true) {
			if(!(t1.isAlive())) {
				t2.stop();
				System.out.println(t1.getName()+"won the Race!");
				break;
			}
			if(!(t2.isAlive()))
			{
				t1.stop();
				System.out.println(t2+"won the Race!");
				break;

			}
		}

	}

}
