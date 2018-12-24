package threadDemo;

public class ThreadDemo7 {

	public static void main(String[] args) {
		TicketPool pool=new TicketPool();
		Salering s1=new Salering("窗口一",pool);
		Salering s2=new Salering("窗口二",pool);
		Salering s3=new Salering("窗口三",pool);
		Salering s4=new Salering("窗口四",pool);
		Salering s5=new Salering("窗口五",pool);
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();

	}

}

//售票员类
class Salering extends Thread{
	private String name;
	private TicketPool pool;
	
	public Salering(String name,TicketPool pool) {
		this.name=name;
		this.pool=pool;
	}
	
	public void run() {
		while(true) {
			int no=pool.getTicket();
			if(no==0) {
				return;
			}
			else {
				System.out.println(name+":"+no);
				//谦让方法
				Thread.yield();
			}
		}
	}
	
}



//票池类
class TicketPool{
	private int tickets=100;
	
	
	//方式一
/*	public int getTicket() {
	//同步代码块，以票池本身作为锁旗标
   synchronized (this) {
	 int temp=tickets;
	 tickets=tickets-1;
	 return temp>0?temp:0;
        }
    }*/
	
	
	//方式二,方法同步是将当前对象当做锁旗标
	public synchronized int getTicket() {
		int temp=tickets;
		tickets=tickets-1;
		return temp>0?temp:0;
	}
	
}






