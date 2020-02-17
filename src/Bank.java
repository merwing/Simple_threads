/**
 *15:35:15
 *Created by @author merwing on 10 sty 2018.
 */
public class Bank
{
	private static int ballance = 1000;
	
	public Bank(int ballance)
	{
		this.ballance = ballance;
	}
	
	public static int getBallance()
	{
		return ballance;
	}
	
	public void setBallance(int ballance)
	{
		this.ballance = ballance;
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		Bank bank = new Bank(1000);
		
		Out out = new Out(bank);
		In in = new In(bank);
		Thread t1 = new Thread(out);
		Thread t2 = new Thread(in);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("ballance: " + bank.getBallance());
	}
}
