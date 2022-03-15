package controller;

import java.util.Random;

public class Exec2 extends Thread {
	private int a;
	private int b;
	private int res;
	private Random r = new Random();

	public Exec2(int b) {
		this.b = b;
	}

	@Override
	public void run() {
		sum();
	}

	private void sum() {
		try {
			Exec2.sleep(b*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int j = 0; j < 5; j++) {
			a = r.nextInt(10);
			res += a;
			if(j==4) {
				System.out.print(" " + a);
			}else {
				System.out.print(" " + a + " +");
			}
		}
		System.out.println();
		System.out.println("Thread => " +b + " = " + res);
	}
}