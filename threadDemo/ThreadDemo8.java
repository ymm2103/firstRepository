package threadDemo;

public class ThreadDemo8 {

	public static void main(String[] args) {
		Salerings s1=new Salerings("����һ");
		Salerings s2=new Salerings("���ڶ�");
		Salerings s3=new Salerings("������");
		Salerings s4=new Salerings("������");
		Salerings s5=new Salerings("������");

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








//Ʊ��
class TicketsPool{
	private static int tickets=9;
	//ͬ����̬��������Ϊ�����
	public synchronized static int getTicket() {
		int temp=tickets;
		tickets=tickets-1;
		return temp>1?temp:0;
	}
	
	
}
