package Extending_ThreadClass;

public class MultiThraeding extends Thread{

	public void run()
	{
		System.out.println(currentThread().getName()); // to get the name of current executing thread
		System.out.println("Multitherading Extending Thread Class");
	}
	public static void main(String[] args) {
		MultiThraeding ob=new MultiThraeding();
		ob.start();
		
		MultiThraeding ob2=new MultiThraeding();
		ob2.start();

	}

}
