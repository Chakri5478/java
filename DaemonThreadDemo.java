//DaemonThread
class DaemonThreadDemo extends Thread{
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println(Thread.currentThread().getName()+" is daemon thread");
		}
		else{
			System.out.println(Thread.currentThread().getName()+" is user thread");
		}
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+":count-"+i);
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args){
		DaemonThreadDemo t1=new DaemonThreadDemo();
		DaemonThreadDemo t2=new DaemonThreadDemo();
		t2.setDaemon(true);
		t1.start();
		t2.start();
		System.out.println("Main thread ended...");
	}
}
