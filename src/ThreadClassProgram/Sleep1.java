package ThreadClassProgram;

 class Sleep1 extends Thread {
	public void run() {
		
	for(int i=1;i<5;i++)
	{
		try {
			//Thread.sleep(500, 100);
			Thread.sleep(500);
		    }
		catch(Exception e)
		    {
				System.out.println(e);
	        }
		System.out.println(i);
	}
}

	public static void main(String[] args) {
		
		Sleep1 t1 = new Sleep1();
		Sleep1 t2 = new Sleep1();
		
		//t1.start();
		//t2.start();
		t1.run();
		t2.run();
		
	}
 }

