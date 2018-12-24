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

//�۷�
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
		  System.out.println(name+"����������1...,�۹���"+n);
	  }
  }
}



//��
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
			  System.out.println(name+"�Ե��˷���:20...");
		  }
	  }
	  
}



//�۹�
class Boxs{
	private int max=20;
	private int count;
	
	//��ӷ���+1
	public synchronized int add() {
		while(count>=max) {
			try {
				this.notify();      //run����ִ����֮��������ͷ�,֪ͨ�ܳԷ���
				this.wait();        //������֮������������ͷ�
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return ++count;
		   
	}
	
	//�Ƴ�
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
             this.notify();   //֪ͨ�۷����
             
               
             
	}
	
}

