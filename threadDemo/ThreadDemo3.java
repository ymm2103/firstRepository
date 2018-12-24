package threadDemo;

public class ThreadDemo3 {

	public static void main(String[] args) {
		Player p1=new Player("钟馗",1000);
		Player p2=new Player("关羽",2000);
		Player p3=new Player("张飞",3000);
		Player p4=new Player("宋江",4000);

		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
		
	   try {
		    p1.join();
		    p2.join();
		    p3.join();
		    p4.join();   
	   }
	   catch(Exception e) {
		   
	   }
		
		
		System.out.println("开局啦啦啦啦啦啦啦啦");

	}

}


class Player extends Thread{
	private String name;
	private int time;
	
	public Player(String name,int time) {
		this.name=name;
		this.time=time;
	}
	
	
	public void run() {
		System.out.println(name+"出发了");
		
		try {
			Thread.sleep(time);
		}
		catch(Exception e){
		}
		System.out.println(name+"到了"+",耗时"+time);
		
		
	}
	
	
}