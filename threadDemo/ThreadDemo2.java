package threadDemo;

public class ThreadDemo2 {

	public static void main(String[] args) {
	SubThread s1=new SubThread("thread 1");
	SubThread s2=new SubThread("thread 2");
	
	s1.start();
	s2.start();

	}

}




class SubThread extends Thread{
 private String name;
 
	public SubThread(String name) {
		this.name=name;
	}
	public void run() {
		for(;;) {
			System.out.println(name);
			
		    SubThread.yield();         //短暂的资源回放
		    
		    
		}
		
	}
}