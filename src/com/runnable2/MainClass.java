package com.runnable2;

public class MainClass {

	public static void main(String[] args) {
		Thread t=new Thread(new MyRunnable());
		t.start();

	}

}
