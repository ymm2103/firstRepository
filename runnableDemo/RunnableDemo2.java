package runnableDemo;

public class RunnableDemo2 {

   public static void main(String[] args) {
	/*	//�����ڲ���,�����߳�
    new Thread(new Runnable() {
    	public void run() {
    		for(int i=0;i<10;i++) {
    			System.out.println(i);
    		}
    	}
     }).start();*/
    
    
    
	new Thread() {
		public void run() {
			for(int i=0;i<10;i++){
				System.out.println(i);
			}
		}
	}.start();	  
  }
}


