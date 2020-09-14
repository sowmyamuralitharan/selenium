package ThreadClassProgram;

public class ThreadPriority1 extends Thread {
	public void run()
	{
		System.out.println("ThreadName" +Thread.currentThread().getName());
		System.out.println("Threadpriority" +Thread.currentThread().getPriority());
		
	}

	public static void main(String[] args) {
		
		ThreadPriority1 t1 = new ThreadPriority1();
		ThreadPriority1 t2 = new ThreadPriority1();
		
		t1.setPriority(Thread.MAX_PRIORITY);  
		t2.setPriority(Thread.MIN_PRIORITY);  
	
		t1.start();
		t2.start();

	}

}
