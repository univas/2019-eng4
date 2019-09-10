package br.edu.univas;

import java.io.IOException;

public class Thread1 extends Thread {

	private String name;
	private MyLog log;
	
	public Thread1(String threadName) throws IOException {
		log = MyLog.getInstance();
		this.name = threadName;
		log.log("Creating " + this.name);
	}
	
	@Override
	public void run() {
		try {
			log.log("Running " + this.name);
			for (int i = 0; i < 10; i++) {
				try {
					log.log(this.name + " hellow " + i);
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			log.log("Exiting " + this.name);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
