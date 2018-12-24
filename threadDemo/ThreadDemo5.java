package threadDemo;

public class ThreadDemo5 {

	public static void main(String[] args) {
		Saler s1=new Saler("����һ");
		Saler s2=new Saler("���ڶ�");
		s1.start();
		s2.start();

	}

}


class Saler extends Thread{
	static int tickets=100;
	//��������������඼�ܷ��ʣ�����staticʱΪ��Ա����
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
	
	
	//ȡƱ����
	public int getTicket() {
		//ͬ�������
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