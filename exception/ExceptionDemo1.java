package exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		int[] arr= {1};
		//System.out.println(arr[1]);
		
		
		Exception e =new Exception();
		Exception e2=new Exception("������");
		//��ӡ�쳣��Ϣ
		System.out.println(e2.getMessage());
		//��ӡջ������Ϣ
		e2.printStackTrace();
		//���쳣
		test();
			
 }
	
	public static void test() {
		try {
			throw new Exception("�����ˣ�����");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("�㶨��");
		}
		
	}
	
}
