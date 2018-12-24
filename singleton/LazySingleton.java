package singleton;

public class LazySingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	//懒汉式单例模式
    //比较懒，在类加载时，不创建实例，因此类加载速度快，但运行时获取对象的速度慢
	private static LazySingleton instance=null;
	
	private LazySingleton() {
		
		//私有构造函数
	}
	
	
	public static synchronized LazySingleton getInstance() {
		if(instance==null)
		{
			instance=new LazySingleton();
		}
		
		return instance;
		
	}
	
	
	
}
