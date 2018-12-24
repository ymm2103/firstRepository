package noNameDemo;

public class NoNameDemo1 {

	public static void main(String[] args) {
		Pet pet=new Dog() {                                  //Pet类型来接收Dog对象；
		/*	public void meng() {
				System.out.println("meng meng da.....");
				run();                                       //  可以调用匿名类中子类的方法；
			}	*/	
			
			public void run() {
				System.out.println("running running");       //匿名类中子类的方法，对象不可以直接调用；
			}    
		};	
		
		
		pet.meng();
		
		
		//创建匿名内部类
		new Cat() {
			public void miao() {
				System.out.println("miaomiao...");
			}
		}.miao();	 

	}

}



//定义抽象宠物类
abstract class Pet{
   abstract public void meng();
}



//Dog类
class Dog extends Pet{
	public void meng() {
		System.out.println("旺旺旺......");
	}
}




//Cat类
class Cat{
	
}
