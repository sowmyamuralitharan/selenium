package ThreadClassProgram;

class Table1 {
	 synchronized void printTable(int n){//synchronized method  
		   for(int i=1;i<=5;i++){  
		     System.out.println(n*i);  
		     try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
		     
		     
		   }  
		  
		 }  
		}  
		  
		class MyThread1 extends Thread{  
		Table1 t;  
		MyThread1(Table1 t){  
		this.t=t;  
		}  
		public void run(){  
		t.printTable(7);  
		}  
		  
		}  
		class MyThread2 extends Thread{  
		Table1 t;  
		MyThread2(Table1 t){  
		this.t=t;  
		}  
		public void run(){  
		t.printTable(100);  
		}  
		}  
		  
		public class TestThread{  
		public static void main(String args[]){  
		Table1 obj = new Table1();//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
		}  
		}  
		/*Output: 5
	       10
	       15
	       20
	       25
	       100
	       200
	       300
	       400
	       500*/
	       


