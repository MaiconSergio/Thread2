package view;

import controller.Exec2;

public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			Thread t = new Exec2(i);
			t.start();
		}
		
	}

}