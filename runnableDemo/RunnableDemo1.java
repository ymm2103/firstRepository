package runnableDemo;

public class RunnableDemo1 {

	public static void main(String[] args) {
     //��̬,��Runnable�������߳�
		Runnable r=new Dog();
        new Thread(r).start();
	}

}

class Animal{
	private String name;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
}


class Dog extends Animal implements Runnable{
	public void eat() {
		System.out.println("like eating bone");
	}
  
	public void run() {
		eat();
	}
	
}