package threadDemo;

import packageDemo.com.test2.PackageDemo2;

public class ThreadPriority {
	public static Object lock=new Object();

	public static void main(String[] args) {
		/*Mythreads m1=new Mythreads("A");
		System.out.println(m1.getPriority());
		m1.setPriority(1);
		System.out.println(m1.getPriority());
		Mythreads m2=new Mythreads("B");*/
		
		 PackageDemo2.main(null);
		
		
		for(int i=1;i<=10;i++) {
			new Mythreads("Thread-"+i,i).start();
		}
		
		while(true) {
			    synchronized(lock) {
				lock.notifyAll();                        //notify()方法执行完同步代码块再执行，因此需要while包含同步代码块
			}                                            //notify()方法没有包含异常声明
		}
		
	}

}



class Mythreads extends Thread{
	private String name;
	
	public Mythreads(String name,int pri) {
		this.name=name;
		this.setPriority(pri);
	}
	
	public void run() {
		synchronized(ThreadPriority.lock) {                 //lock为静态的，通过ThreadPriority类来访问
			while(true) {
				try {
					System.out.println(name);
					ThreadPriority.lock.wait();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}


