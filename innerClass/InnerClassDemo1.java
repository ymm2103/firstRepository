package innerClass;

public class InnerClassDemo1 {

	public static void main(String[] args) {
		
		Benz b=new Benz();
		b.run();
	
		
	}

}


class Benz{
	String color="white";
	int tires;
	
	//��Ա���������ڲ���
	public void run() {
		Engine e=new Engine();
		e.fire("key001");
		System.out.println("run...");

	}
	
	
	
	//�ڲ��������Աλ����
	class Engine{

		public void fire(String key) {
			System.out.println(key+" ready");
			System.out.println("fire...");	
			
		}
		
	}
	
}