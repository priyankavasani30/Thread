package threadcreation;

public class Thread2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			System.out.println("Hello....!");
		}
	}
}
