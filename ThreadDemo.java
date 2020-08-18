package javamanideep;

public class ThreadDemo implements Runnable{
	public void run() {
		System.out.println("run method");
		System.out.println("run method "+Thread.currentThread().getName());
		for(int i=0;i<10;i++)
		{
		System.out.println(i);

		try {
		Thread.sleep(1000);
		} catch (InterruptedException e) {

		e.printStackTrace();
		}
		}
		
		}
	public static void main(String[] args) {
		ThreadDemo t=new ThreadDemo();
		Thread thd=new Thread(t);
		thd.start();
		System.out.println("main method "+Thread.currentThread().getName());
	
	}

}
