package polyDemo;

public class PolyDemo1 {

  public static void main(String[] args) {
		
  Dog d1=new Dog();
  d1.cry();
  
  
  //��������
  Animal a1=d1;
  a1.cry();
   
  
  //��������
   Animal a2=new Dog();
	a1.cry();
	
	//�������ã�ǿ��ת��(������ڼ̳й�ϵ)
	Animal a3=new Dog(); 
	Dog d3=(Dog)a3;
	
	
	
	//�ӿ�����,Dogʵ���˽ӿ�
	Eatable e1=new Dog();
	e1.eat();
	
	}
	
}


interface Eatable{
	public void eat();
}

abstract class Animal{
	abstract void cry();
}



class Dog extends Animal implements Eatable{
	public void cry() {
		System.out.println("������....");
	}
	
	
	public void eat() {
		System.out.println("��......");
	}
	
	
	
}


