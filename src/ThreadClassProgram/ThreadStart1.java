package ThreadClassProgram;

public class ThreadStart1 extends Thread{
	
	public void run()
	{
	System.out.println("thread is running");
	}

	public static void main(String[] args) {
		
		ThreadStart1 t1 = new ThreadStart1();
		t1.start();
		
		

	}

}
