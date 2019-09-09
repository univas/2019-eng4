package br.edu.univas;

public class App {

	public static void main(String[] args) {
		try {
			Thread1 thread1 = new Thread1("THREAD 1");
			Thread1 thread2 = new Thread1("THREAD 2");
			Thread1 thread3 = new Thread1("THREAD 3");
			Thread1 thread4 = new Thread1("THREAD 4");

			thread1.start();
			thread2.start();
			thread3.start();
			thread4.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
