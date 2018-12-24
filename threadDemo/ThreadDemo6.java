package threadDemo;

public class ThreadDemo6 {

	public static void main(String[] args) {
		Object lock=new Object();
		Salers s1=new Salers("����һ",lock);
		Salers s2=new Salers("���ڶ�",lock);
		s1.start();
		s2.start();

	}

}



//��ƱԱ��
class Salers extends Thread{
	static int tickets=100;
	//�����
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
	
	
	
	
	
	//ȡƱ����
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



