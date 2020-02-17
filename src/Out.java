import java.util.Random;

/**
 * 
 */

/**
 *17:15:02
 *Created by @author merwing on 10 sty 2018.
 */
public class Out extends Thread
{	
	final static int value = 100;
	Random random = new Random();
	Bank b1;
	
	public Out(Bank b)
	{
		b1 = b;
	}
	
	@Override public void run()
	{
		try 
		{
			for(int i = 0; i < 100; i++)
			{
				if(b1.getBallance() > value)
				{
					System.out.println(Bank.getBallance());
					sleep(random.nextInt(3));
					b1.setBallance(b1.getBallance() - value);
					sleep(random.nextInt(4));
				}
				else
				{
					System.out.println("brak srodkow");
				}
			}
			
			
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
}
