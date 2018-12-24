package threadDemo;

public class ThreadDemo5 {

	public static void main(String[] args) {
		Saler s1=new Saler("窗口一");
		Saler s2=new Saler("窗口二");
		s1.start();
		s2.start();

	}

}


class Saler extends Thread{
	static int tickets=100;
	//创建类对象，所有类都能访问，不加static时为成员变量
	 static	Object lock=new Object();                    
	private String name;
	
	public Saler(String name){
		this.name=name;
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
		//同步代码块
		synchronized(lock) {  
			int t=tickets;
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
			
			tickets=tickets-1;
			return t<1?-1:t;
		}
		
	}
	
	
}