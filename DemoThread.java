package threadcreation;

public class DemoThread {

	public static void main(String[] args) 
	{
		Thread1 th1=new Thread1();
		th1.start();
		
		Thread2 th2=new Thread2();
		Thread th = new Thread(th2);
		th.start();
		
		System.out.println("Thread is started");
	}

}
