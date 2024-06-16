package threadfunctionexample;

class A extends Thread
{
	public void run() 
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("Good Morning");
		}
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

class B extends Thread
{
	public void run() 
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("Have a nice day..!");
		}
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

public class ThreadFunctionExample {
	
	public static void main(String[] args)
	{
		A thread1 = new A();
		B thread2 = new B();
		
		//System.out.println(thread1.getName());
		//System.out.println(thread2.getName());
		
		thread1.start();
		
		try
		{
			thread1.join();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		 thread2.start();
		
		 thread1.setName("First");
		 thread2.setName("second");
		
		
	    System.out.println(thread1.getName());
		System.out.println(thread2.getName());
		System.out.println("Bye Bye......");
		
	}

}
