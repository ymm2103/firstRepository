package threadDemo;

public class ThreadDemo8 {

	public static void main(String[] args) {
		Salerings s1=new Salerings("窗口一");
		Salerings s2=new Salerings("窗口二");
		Salerings s3=new Salerings("窗口三");
		Salerings s4=new Salerings("窗口四");
		Salerings s5=new Salerings("窗口五");

      s1.start();
      s2.start();
      s3.start();
      s4.start();
      s5.start();
	}

}


class Salerings extends Thread{
	private String name;
	public Salerings(String name) {
		this.name=name;
	}
	
	
	public void run() {
		while(true) {
			int no=TicketsPool.getTicket();
			if(no==0) {
				return;
			}
			else {
				System.out.println(name+":"+no);
			}
		}
	}
	
}








//票池
class TicketsPool{
	private static int tickets=9;
	//同步静态方法，类为锁旗标
	public synchronized static int getTicket() {
		int temp=tickets;
		tickets=tickets-1;
		return temp>1?temp:0;
	}
	
	
}
