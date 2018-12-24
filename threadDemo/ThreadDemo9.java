package threadDemo;

public class ThreadDemo9 {

	public static void main(String[] args) {

		java.util.List<Integer> list=new java.util.ArrayList<Integer>();
		Productor p=new Productor("������",list);
        Consumer c=new Consumer("������",list);	
        p.start();
        c.start();
        
        
        
	}

}




//������
class Productor extends Thread{
	private String name;
	private java.util.List<Integer> list;
	public Productor(String name,java.util.List<Integer> list) {
		this.name=name;
		this.list=list;
	}
	public void run() {
		int i=0;
		while(true) {
			list.add(new Integer(i++));
			System.out.println(name+"�����"+i);
		}
	}
}





//������
class Consumer extends Thread{
	private String name;
	private java.util.List<Integer> list;
	public Consumer(String name,java.util.List<Integer> list) {
		this.name=name;
		this.list=list;
	}
	public void run() {
		while(true) {
			if(list.size()>0) {
				int i=list.remove(0);  //0��ʾȡ����һ��Ԫ��
				try {
					Thread.sleep(2000);
				}
				catch(Exception e) {}
				System.out.println(name+"ȡ����"+i);
			}
			
			
		}
	}
}
