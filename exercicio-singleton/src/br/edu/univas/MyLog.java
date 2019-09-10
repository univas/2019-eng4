package br.edu.univas;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyLog {

	private static MyLog instance;
	private final String FILE_NAME = "C:\\Rodrigo\\Java\\log.txt";
	private BufferedOutputStream bufferedOutputStream;
	
	private MyLog() {
		try {
			FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
			bufferedOutputStream = new BufferedOutputStream(outputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static MyLog getInstance() {
		if (instance == null) {
			instance = new MyLog();
		}
		return instance;
	}
	
	public void log(String content) throws IOException {
		bufferedOutputStream.write(content.getBytes());
		bufferedOutputStream.write("\n".getBytes());
		bufferedOutputStream.flush();
	}
}
