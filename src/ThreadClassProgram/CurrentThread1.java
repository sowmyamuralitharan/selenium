package ThreadClassProgram;

class CurrentThread1 extends Thread{
	public void run()
	{
		System.out.println("running");
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		CurrentThread1 t1 = new CurrentThread1();
		CurrentThread1 t2 = new CurrentThread1();
		
		t1.start();
		t2.start();
	}

}
