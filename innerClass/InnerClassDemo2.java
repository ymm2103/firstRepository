package innerClass;

public class InnerClassDemo2 {

	public static void main(String[] args) {
		
Benzs b=new Benzs();
b.run();
	}

}


class Benzs{
	String color;
	int tires;
	
	
	public void run() {
	   String key="key666";
		
		
		//�ڲ����ڷ�����
		class Engine{
			
			public void fire() {
				//key���ڲ������ã�Ĭ��Ϊfinal����
				System.out.println(key+" ready...");
				System.out.println("fire...");
			}
			
		}
		
		Engine e=new Engine();
		e.fire();
		
	}
	
	
}