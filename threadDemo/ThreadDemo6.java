package threadDemo;

public class ThreadDemo6 {

	public static void main(String[] args) {
		Object lock=new Object();
		Salers s1=new Salers("窗口一",lock);
		Salers s2=new Salers("窗口二",lock);
		s1.start();
		s2.start();

	}

}



//售票员类
class Salers extends Thread{
	static int tickets=100;
	//锁旗标
	Object lock;
	private String name;
	
	public Salers(String name,Object lock) {
		this.name=name;
		this.lock=lock;
	}
	
	
	public void run() {
		while(true) {
		int t=getTicket();
		if(t==-1) {
			return;
	    	}
		else {
			System.out.println(name+":"+t);
		}
		}
	}
	
	
	
	
	
	//取票方法
	public int getTicket() {
		synchronized(lock) {
			int t=tickets;
			try {
				Thread.sleep(50);
			}
			catch(Exception e){
				
			}
			tickets=tickets-1;
			return t<1?-1:t;
		}
	}

	
	
}



