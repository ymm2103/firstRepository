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
	
	//成员方法调用内部类
	public void run() {
		Engine e=new Engine();
		e.fire("key001");
		System.out.println("run...");

	}
	
	
	
	//内部类在类成员位置上
	class Engine{

		public void fire(String key) {
			System.out.println(key+" ready");
			System.out.println("fire...");	
			
		}
		
	}
	
}