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




//�����ܳԵĽӿ�
interface  Eatable{
	public void eat();
	
}


//��������ĳ���ӿ�
interface Pet{
	public void buy();
	
}



//�����������
abstract class Animal{
	public abstract void cry();
	
}


//���幷��
class Dog extends Animal{
	public void cry() {
	System.out.println("dog������....");
	}
}

//���幷������
class Jing8 extends Dog implements Eatable,Pet{
	//��дcry����
	public void cry() {
		System.out.println("����������....");
	}
	
	//ʵ���ܳԵĽӿ�
	public void eat() {
		System.out.println("���Ϳ��Գ�");
	}
	
	//ʵ������Ľӿ�
	public void buy() {
		System.out.println("���Ϳ�����");
	}
	
	
}



//����Ի��ࣺ�������óԵĽӿ�
class Eater{
	
	public void canEat(Eatable e) {
		e.eat();
		System.out.println("������ô�ɰ����᲻�óԾ���");
	}
}



//���帻���ࣺ�������ó���Ľӿ�
class 	Richer{
	public void canBuy(Pet p) {
		p.buy();
		System.out.println("��Ǯ��ϲ���򾩰�");
	}
	
}


