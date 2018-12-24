package polyDemo;

public class PolyDemo1 {

  public static void main(String[] args) {
		
  Dog d1=new Dog();
  d1.cry();
  
  
  //向上引用
  Animal a1=d1;
  a1.cry();
   
  
  //向上引用
   Animal a2=new Dog();
	a1.cry();
	
	//向下引用，强制转换(必须存在继承关系)
	Animal a3=new Dog(); 
	Dog d3=(Dog)a3;
	
	
	
	//接口引用,Dog实现了接口
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
		System.out.println("汪汪汪....");
	}
	
	
	public void eat() {
		System.out.println("吃......");
	}
	
	
	
}


