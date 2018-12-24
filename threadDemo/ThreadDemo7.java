package threadDemo;

public class ThreadDemo7 {

	public static void main(String[] args) {
		TicketPool pool=new TicketPool();
		Salering s1=new Salering("����һ",pool);
		Salering s2=new Salering("���ڶ�",pool);
		Salering s3=new Salering("������",pool);
		Salering s4=new Salering("������",pool);
		Salering s5=new Salering("������",pool);
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();

	}

}

//��ƱԱ��
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
				//ǫ�÷���
				Thread.yield();
			}
		}
	}
	
}



//Ʊ����
class TicketPool{
	private int tickets=100;
	
	
	//��ʽһ
/*	public int getTicket() {
	//ͬ������飬��Ʊ�ر�����Ϊ�����
   synchronized (this) {
	 int temp=tickets;
	 tickets=tickets-1;
	 return temp>0?temp:0;
        }
    }*/
	
	
	//��ʽ��,����ͬ���ǽ���ǰ�����������
	public synchronized int getTicket() {
		int temp=tickets;
		tickets=tickets-1;
		return temp>0?temp:0;
	}
	
}






