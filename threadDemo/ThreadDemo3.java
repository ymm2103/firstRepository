package threadDemo;

public class ThreadDemo3 {

	public static void main(String[] args) {
		Player p1=new Player("��ظ",1000);
		Player p2=new Player("����",2000);
		Player p3=new Player("�ŷ�",3000);
		Player p4=new Player("�ν�",4000);

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
		
		
		System.out.println("��������������������");

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
		System.out.println(name+"������");
		
		try {
			Thread.sleep(time);
		}
		catch(Exception e){
		}
		System.out.println(name+"����"+",��ʱ"+time);
		
		
	}
	
	
}