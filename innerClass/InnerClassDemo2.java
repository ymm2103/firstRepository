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
		
		
		//内部类在方法内
		class Engine{
			
			public void fire() {
				//key被内部类引用，默认为final类型
				System.out.println(key+" ready...");
				System.out.println("fire...");
			}
			
		}
		
		Engine e=new Engine();
		e.fire();
		
	}
	
	
}