package singleton;

public class EagerSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	private static EagerSingleton instance=new EagerSingleton();
	
	private EagerSingleton() {
		
		//私有构造函数
	}
	
	
	public static EagerSingleton getInstance() {
		
		return instance;
	}
		

}
