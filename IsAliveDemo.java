//IsAlive and Join
class MyThread extends Thread{
	String name;
	MyThread(String name){
		this.name=name;
	}
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(name+" is running "+i);
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				System.out.println(name+" is Interupted");
			}
		}
		System.out.println(name+" Finished Execution");
	}
}
public class IsAliveDemo{
	public static void main(String[] args){
		MyThread t1=new MyThread("Thread-1");
		MyThread t2=new MyThread("Thread-2");
		t1.start();
		t2.start();
		System.out.println("t1 is alive"+t1.isAlive());
		System.out.println("t2 is alive"+t2.isAlive());
		try{
			t1.join();
			System.out.println("t1 has finished,main thread resumes");
			t2.join();
			System.out.println("t2 has finished,main thread resumes");
		}
		catch(InterruptedException e){
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread ended");
	}
}
