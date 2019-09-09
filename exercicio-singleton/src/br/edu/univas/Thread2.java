package br.edu.univas;

public class Thread2 extends Thread {

	private final String THREAD_NAME = "THREAD_2";
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(THREAD_NAME + " hellow " + i);
		}
	}

}
