package threadDemo;

public class ThreadDemo10 {

	public static void main(String[] args) {
		Pool pool=new Pool();
	    Productors pro1=new Productors("生产者1",pool);
	   // Productors pro2=new Productors("生产者2",pool);
	    Consumers con1=new Consumers("消费者2",pool);
	    Consumers con2=new Consumers("消费者2",pool);

	    
	    
	   pro1.start();
   //  pro2.start();
	   con1.start();
	   con2.start();
	    
	    
	     
	}

}






//生产者
class Productors extends Thread{
	private String name;
	private Pool pool;
	static int i=0;
	
	public Productors(String name,Pool pool) {
		this.name=name;
		this.pool=pool;
	}
	

	public void run() {
	
		while(true) {
			pool.add(i++);    
			/*try {
				Thread.sleep(100);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
	     //System.out.println(name+"添加了"+i);
		}
			
	}
}	
	

	
	//消费者
	class Consumers extends Thread{
		private String name;
		private Pool pool;
		
		public Consumers(String name,Pool pool) {
			this.name=name;
			this.pool=pool;
		}
	

		public void run() {
			while(true) {
				    int i=pool.remove();
				   /* try {
				    	Thread.sleep(100);
				    }
				    catch(Exception e) {
				    	e.printStackTrace();
				    }
					System.out.println("取出了"+i);*/
				  }
				}		
  }
	





//池类
class Pool{
	private java.util.List<Integer> list=new java.util.ArrayList<Integer>();
	//容器最大值
	private int mx=1;
	
	//添加元素
	public void add(int n) {
		synchronized(this) {
		    try {
		    String name=Thread.currentThread().getName();
			while(list.size()==mx) {
			        System.out.println(name+".wait()");
					this.wait(100);
				    }
			list.add(n);
			System.out.println(name+"+:"+n);
			System.out.println(name+".notify()");
			this.notifyAll();         //通知线程可以消费元素
		     }
				catch(Exception e) {	
				e.printStackTrace();
				}
			}		
		}
		
	
	
	//移除元素
	public int remove() {
		synchronized(this) {
			try {
				String name=Thread.currentThread().getName();
				while(list.size()==0) {
				 	System.out.println(name+".wait()");
					this.wait(100);
				}
				
					int i=list.remove(0);
					System.out.println(name+"-:"+i);
		 			System.out.println(name+".notify()");
					this.notifyAll();          //通知去生产元素
					return i;		
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return -1;
		}		
	}
}




