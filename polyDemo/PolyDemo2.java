package polyDemo;

public class PolyDemo2 {

	public static void main(String[] args) {
			
	
 Jing8 jing8=new Jing8();
 jing8.cry();
 
 jing8.name="jing8";
System.out.println(jing8.name); 
jing8.cry();


//jing8����ת��Ϊdog
Dogs dog=jing8;
System.out.println(dog.name);       //name���Բ��ᱻ���ǣ�Ϊdog������
dog.cry();                          //cry()�����ᱻ���ǣ�Ϊjing8�ķ���
 
	}

}



abstract class Animals{
	public abstract void cry(); 
}


class Dogs extends Animals{
	
	public String name="���dog";

	public void cry() {
	System.out.println("������.....");	
	}
}



class Jing8 extends Dogs{
	
	public String name="jing8dog";
	
	public void cry() {
		System.out.println("jing8.......");
	}
}

