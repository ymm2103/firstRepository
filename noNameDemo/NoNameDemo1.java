package noNameDemo;

public class NoNameDemo1 {

	public static void main(String[] args) {
		Pet pet=new Dog() {                                  //Pet����������Dog����
		/*	public void meng() {
				System.out.println("meng meng da.....");
				run();                                       //  ���Ե���������������ķ�����
			}	*/	
			
			public void run() {
				System.out.println("running running");       //������������ķ��������󲻿���ֱ�ӵ��ã�
			}    
		};	
		
		
		pet.meng();
		
		
		//���������ڲ���
		new Cat() {
			public void miao() {
				System.out.println("miaomiao...");
			}
		}.miao();	 

	}

}



//������������
abstract class Pet{
   abstract public void meng();
}



//Dog��
class Dog extends Pet{
	public void meng() {
		System.out.println("������......");
	}
}




//Cat��
class Cat{
	
}
