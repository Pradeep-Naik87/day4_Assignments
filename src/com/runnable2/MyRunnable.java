package com.runnable2;

public class MyRunnable implements Runnable
{

	@Override
	public void run() {
		for(int i=1;i<=20;i++)
		{
			System.out.println(i);
		}
		
	}

}
