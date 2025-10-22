class SharedBuffer{
	private int data;
	private boolean hasData=false;
	public synchronized void produce(int value){
		while(hasData){
			try{
				wait();
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
		data=value;
		hasData=true;
		System.out.println("Produced:"+data);
		notify();
	}
	
	public synchronized void consume(){
		while(!hasData){
			try{
				wait();
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
		System.out.println("Consumed:"+data);
		hasData=false;
		notify();
	}
}
class ProducerThread extends Thread{
	SharedBuffer buffer;
	ProducerThread(SharedBuffer buffer){
		this.buffer=buffer;
	}
	public void run(){
		for(int i=1;i<=5;i++){
			buffer.produce(i);
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e){}
		}
	}
}
class ConsumerThread extends Thread{
	SharedBuffer buffer;
	ConsumerThread(SharedBuffer buffer){
		this.buffer=buffer;
	}
	public void run(){
		for(int i=1;i<=5;i++){
			buffer.consume();
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){}
		}
	}
}
public class ProducerConsumerDemo{
	public static void main(String[] args){
		SharedBuffer buffer=new SharedBuffer();
		ProducerThread p=new ProducerThread(buffer);
		ConsumerThread t=new ConsumerThread(buffer);
		p.start();
		t.start();
	}
}
