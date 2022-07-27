package lesson3;

public class MyRunnableThread implements Runnable{
	public static int count=0;
	public MyRunnableThread() {
		while(MyRunnableThread.count<=20)
		{
			try
			{
				System.out.println("Expl Thread: "+(++MyRunnableThread.count));
				Thread.sleep(100);
			}
			catch (InterruptedException e){
                System.out.println("Exception in main thread: "+e.getMessage());

			}
		}
	}
	public static void main(String[] args) {
		
		MyRunnableThread mt=new MyRunnableThread();
		Thread t=new Thread(mt);
		t.start();
		while(MyRunnableThread.count<=20)
		{
			try
			{
				System.out.println("Expl Thread: "+(++MyRunnableThread.count));
				Thread.sleep(100);
			}
			catch (InterruptedException e){
                System.out.println("Exception in main thread: "+e.getMessage());

			}
		}
		System.out.println("End of the main Thraed..");
	}
	}


