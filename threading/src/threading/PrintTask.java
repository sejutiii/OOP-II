package threading;

import java.util.Random;

public class PrintTask implements Runnable
{
	private final int sleepTime;
	private final String taskName;
	private final static Random generator= new Random();
	
	public PrintTask(String name)
	{
		this.taskName= name;
		this.sleepTime= generator.nextInt(5000);
	}
	
	public void run()
	{
		try
		{
			System.out.println(this.taskName + " going to sleep for " + this.sleepTime + " miliseconds");
			Thread.sleep(sleepTime);
		}
		
		catch(InterruptedException exception)
		{
			System.out.println(this.taskName + " terminated prematurely due to interruption");
		}
		
		System.out.println(this.taskName + " done sleeping");
	}
}
