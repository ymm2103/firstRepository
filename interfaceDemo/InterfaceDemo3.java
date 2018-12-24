package interfaceDemo;

public class InterfaceDemo3 {

	public static void main(String[] args) {
		
		Jing8 j=new Jing8();
		
		Eater e=new Eater();
		e.canEat(j);
		
		Richer r=new Richer();
		r.canBuy( j);
		
		

	}

}




//定义能吃的接口
interface  Eatable{
	public void eat();
	
}


//定义能买的宠物接口
interface Pet{
	public void buy();
	
}



//定义抽象动物类
abstract class Animal{
	public abstract void cry();
	
}


//定义狗类
class Dog extends Animal{
	public void cry() {
	System.out.println("dog汪汪汪....");
	}
}

//定义狗的子类
class Jing8 extends Dog implements Eatable,Pet{
	//重写cry方法
	public void cry() {
		System.out.println("京巴汪汪汪....");
	}
	
	//实现能吃的接口
	public void eat() {
		System.out.println("京巴可以吃");
	}
	
	//实现能买的接口
	public void buy() {
		System.out.println("京巴可以买");
	}
	
	
}



//定义吃货类：方法调用吃的接口
class Eater{
	
	public void canEat(Eatable e) {
		e.eat();
		System.out.println("京巴那么可爱，舍不得吃京巴");
	}
}



//定义富人类：方法调用宠物的接口
class 	Richer{
	public void canBuy(Pet p) {
		p.buy();
		System.out.println("有钱人喜欢买京巴");
	}
	
}


