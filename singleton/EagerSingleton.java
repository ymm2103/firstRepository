package singleton;

public class EagerSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	private static EagerSingleton instance=new EagerSingleton();
	
	private EagerSingleton() {
		
		//˽�й��캯��
	}
	
	
	public static EagerSingleton getInstance() {
		
		return instance;
	}
		

}
