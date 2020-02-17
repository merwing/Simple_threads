import java.util.Random;

public class In extends Thread
{
	final static int value = 100;
	Random random = new Random();
	Bank b1;
	
	public In(Bank b)
	{
		b1 = b;
	}
	
	@Override public void run()
	{
		try 
		{
			for(int i = 0; i < 100; i++)
			{
				System.out.println(b1.getBallance());
				sleep(random.nextInt(3));
				b1.setBallance(b1.getBallance() + value);
				sleep(random.nextInt(4));
			}
			
			
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}

}