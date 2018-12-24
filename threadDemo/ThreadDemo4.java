package threadDemo;

public class ThreadDemo4 {

	public static void main(String[] args) {
		Box b1=new Box("No1",3000);
		Box b2=new Box("No2",7000);
		Waiter w=new Waiter();
		
		//设置服务员为守护线程
		w.setDaemon(true);
		
		b1.start();
		b2.start();
		w.start();
		
	
		
		

	}

}


//包厢线程
class Box extends Thread{
	private String no;
	private int time;
	public Box(String no,int time) {
		this.no=no;
		this.time=time;
	}
	
	public void run() {
		System.out.println(no+"号包房开始消费！");
	try {
		Thread.sleep(time);
	}
	catch(Exception e) {
	}
	System.out.println(no+"号包房消费时间："+time+"ms,消费结束！");

	}
	
}


//服务员线程
class Waiter extends Thread{
	public void run(){
		  //打印当前时间
		while(true) {
			System.out.println(new java.util.Date());
			//捕获异常
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
	
	
}




