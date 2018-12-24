package threadDemo;

public class ManTouDemo {

	public static void main(String[] args) {
		Basket ba=new Basket();
		for(int i=1;i<=40;i++) {
			new Worker("worker-"+i,ba).start();
		}

	}

}



class Worker extends Thread{
	private String name;
	private static int max=3;     //����������ͷ�������
	private int count;
	private Basket basket;
	
	public Worker(String name,Basket basket) {
		    this.name=name;
		    this.basket=basket;
	}
	
	public void run() {
		while(true) {
			//�ж��Ƿ��Ѿ��Ա�
			if(count>=max) {
				return;
			}
			//ȡ��ͷ
			int no=basket.getMantou();
            if(no==0) {
            	return;
            }
            
            //�õ�����ͷ
            count++;
            System.out.println(name+":"+no);
            
		}
	}
}



//ͬ���������Ե�ǰ������Ϊ�����
class Basket{
	private int count=100;
	
	public synchronized int getMantou() {
		int temp=count;
		count--;
		return temp>0?temp:0;  
	}
}