package threadDemo;

public class BeeDemo {

	public static void main(String[] args) {
		Boxs bx=new Boxs();
		for(int i=1;i<=100;i++) {
			new Bee("Bee-"+i,bx).start();
		}
		Bear bear1=new Bear("xiong1",bx);
		Bear bear2=new Bear("xiong2",bx);
		
		bear1.start();
		bear2.start();
		
		
		

	}

}

//蜜蜂
class Bee extends Thread{
  private String name;
  private Boxs box;

  public Bee(String name,Boxs box) {
	this.name=name;
	this.box=box;
  }
  
  public void run() {
	  while(true) {
		  int n=box.add();
		  System.out.println(name+"生产力蜂蜜1...,蜜罐量"+n);
	  }
  }
}



//熊
class Bear extends Thread{
	 private String name;
	  private Boxs box;

	  public Bear(String name,Boxs box) {
		this.name=name;
		this.box=box;
	  }
	  
	  public void run() {
		  while(true) {
			  box.remove();
			  System.out.println(name+"吃掉了蜂蜜:20...");
		  }
	  }
	  
}



//蜜罐
class Boxs{
	private int max=20;
	private int count;
	
	//添加蜂蜜+1
	public synchronized int add() {
		while(count>=max) {
			try {
				this.notify();      //run方法执行完之后锁旗标释放,通知熊吃蜂蜜
				this.wait();        //调用完之后锁旗标立即释放
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return ++count;
		   
	}
	
	//移除
	public synchronized void remove() {
             while(count<max) 
             {
             try {
            	 this.wait();
             }
              catch(Exception e) {
            	  e.printStackTrace();
              }
             }
             count=0;
             this.notify();   //通知蜜蜂产蜜
             
               
             
	}
	
}

