package threadDemo;

public class ThreadDemo1 {

	public static void main(String[] args) {
		
  MyThread m=new MyThread();
  YourThread y=new YourThread();
  
  //����start����
  m.start();
  y.start();
    
	}

}


class MyThread extends Thread{
	public void run() {
		for(;;) {
			System.out.println("thread 1");
		}
		
	}
}



class YourThread extends Thread{
	public void run() {
		for(;;) {
			System.out.println("thread 2");
		}
		
	}
}