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
	private static int max=3;     //工人所吃馒头的最大数
	private int count;
	private Basket basket;
	
	public Worker(String name,Basket basket) {
		    this.name=name;
		    this.basket=basket;
	}
	
	public void run() {
		while(true) {
			//判断是否已经吃饱
			if(count>=max) {
				return;
			}
			//取馒头
			int no=basket.getMantou();
            if(no==0) {
            	return;
            }
            
            //拿到了馒头
            count++;
            System.out.println(name+":"+no);
            
		}
	}
}



//同步方法，以当前对象作为锁旗标
class Basket{
	private int count=100;
	
	public synchronized int getMantou() {
		int temp=count;
		count--;
		return temp>0?temp:0;  
	}
}