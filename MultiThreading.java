package Runnable_Interface;

public class MultiThreading implements Runnable{
	@Override
	public void run() {
		System.out.println("Implementing Runnable interface");
		
	}
	public static void main(String[] args) {
		MultiThreading ob=new MultiThreading();
		Thread t1=new Thread(ob);
		t1.start();
		
		Thread t2=new Thread(ob);
		t2.start();
	}

	

}
