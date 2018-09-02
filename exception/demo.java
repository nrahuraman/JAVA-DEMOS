


class demo implements Runnable
{
	public void run()
	{
		System.out.println("THREAD INVOKED USING RUNNABLE");
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		demo obj=new demo();
		Thread obj1=new Thread(obj);
		Thread obj2=new Thread(obj);
		obj1.start();
		obj2.start();
			
	}
}