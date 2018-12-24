package threadDemo;

public class ThreadDemo10 {

	public static void main(String[] args) {
		Pool pool=new Pool();
	    Productors pro1=new Productors("������1",pool);
	   // Productors pro2=new Productors("������2",pool);
	    Consumers con1=new Consumers("������2",pool);
	    Consumers con2=new Consumers("������2",pool);

	    
	    
	   pro1.start();
   //  pro2.start();
	   con1.start();
	   con2.start();
	    
	    
	     
	}

}






//������
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
	     //System.out.println(name+"�����"+i);
		}
			
	}
}	
	

	
	//������
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
					System.out.println("ȡ����"+i);*/
				  }
				}		
  }
	





//����
class Pool{
	private java.util.List<Integer> list=new java.util.ArrayList<Integer>();
	//�������ֵ
	private int mx=1;
	
	//���Ԫ��
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
			this.notifyAll();         //֪ͨ�߳̿�������Ԫ��
		     }
				catch(Exception e) {	
				e.printStackTrace();
				}
			}		
		}
		
	
	
	//�Ƴ�Ԫ��
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
					this.notifyAll();          //֪ͨȥ����Ԫ��
					return i;		
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return -1;
		}		
	}
}




