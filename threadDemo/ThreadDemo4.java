package threadDemo;

public class ThreadDemo4 {

	public static void main(String[] args) {
		Box b1=new Box("No1",3000);
		Box b2=new Box("No2",7000);
		Waiter w=new Waiter();
		
		//���÷���ԱΪ�ػ��߳�
		w.setDaemon(true);
		
		b1.start();
		b2.start();
		w.start();
		
	
		
		

	}

}


//�����߳�
class Box extends Thread{
	private String no;
	private int time;
	public Box(String no,int time) {
		this.no=no;
		this.time=time;
	}
	
	public void run() {
		System.out.println(no+"�Ű�����ʼ���ѣ�");
	try {
		Thread.sleep(time);
	}
	catch(Exception e) {
	}
	System.out.println(no+"�Ű�������ʱ�䣺"+time+"ms,���ѽ�����");

	}
	
}


//����Ա�߳�
class Waiter extends Thread{
	public void run(){
		  //��ӡ��ǰʱ��
		while(true) {
			System.out.println(new java.util.Date());
			//�����쳣
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
	
	
}




