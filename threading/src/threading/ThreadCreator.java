package threading;

import java.lang.Thread;

public class ThreadCreator {

	public static void main(String[] args) {
		
		System.out.println("Creating Threads");
		
		Thread thread1 = new Thread(new PrintTask("task1"));
		Thread thread2 = new Thread(new PrintTask("task2"));
		Thread thread3 = new Thread(new PrintTask("task3"));
		
		System.out.println("Threads created. Starting tasks.");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println("Tasks started. Main ends");

	}

}
