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


//������
  abstract class Animal{
	
	abstract void cry();
}
  
  
  
  //�����������(û��ʵ�ָ���ĳ��󷽷�ʱ�������ǳ�����)
  class Dog extends Animal{
	  
	  public void cry() {
		  System.out.println("������.....");
	  }
	  
  }
  
  
  
  
  
  //ʵ���˳�����
  class Cat extends Animal{
	  public void cry() {
		  System.out.println("������.....");
	  }
  }
  