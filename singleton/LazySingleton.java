package singleton;

public class LazySingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	//����ʽ����ģʽ
    //�Ƚ������������ʱ��������ʵ�������������ٶȿ죬������ʱ��ȡ������ٶ���
	private static LazySingleton instance=null;
	
	private LazySingleton() {
		
		//˽�й��캯��
	}
	
	
	public static synchronized LazySingleton getInstance() {
		if(instance==null)
		{
			instance=new LazySingleton();
		}
		
		return instance;
		
	}
	
	
	
}
