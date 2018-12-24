package abstractClass;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog dog=new Dog();
		dog.cry();
		
		Cat cat=new Cat();
		cat.cry();
		
		
	}

}


//抽象类
  abstract class Animal{
	
	abstract void cry();
}
  
  
  
  //抽象类的子类(没有实现父类的抽象方法时，必须是抽象类)
  class Dog extends Animal{
	  
	  public void cry() {
		  System.out.println("汪汪汪.....");
	  }
	  
  }
  
  
  
  
  
  //实现了抽象类
  class Cat extends Animal{
	  public void cry() {
		  System.out.println("喵喵喵.....");
	  }
  }
  