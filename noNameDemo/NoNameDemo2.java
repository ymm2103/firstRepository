package noNameDemo;

public class NoNameDemo2 {

	public static void main(String[] args) {
	
	Button b1=new Button();
	 
	
	//�����ڲ�����Ϊ����
/*	b1.addListener(new Mouselistener() {
		public void onClick() {
			System.out.println("����һ��");
		}
		
		public void onDbClick() {
			System.out.println("˫��һ��");
		}
		
		public void rightClick() {
			System.out.println("�һ�һ��");
		}
		
	});
	
	b1.click();
	b1.dbClick();*/
	
	
	
	//����������ģʽ
	b1.addListener(new MouseListenerAdapter() {
		public void onClick() {
			System.out.println("����һ��");
		}
		
		public void onDbClick() {
			System.out.println("˫��һ��");
		}	
	});
	
	b1.click();
	b1.dbClick();

	}

}




//��ť��
class Button{
	private Mouselistener listener;
	
	public void addListener(Mouselistener listener) {
		this.listener=listener;
	}
	
	public void click() {
		listener.onClick();
	}	
	
	public void dbClick() {
		listener.onDbClick();
	}
}




 //���������ӿ�
interface Mouselistener{
	public void onClick();      //�����¼�
	public void onDbClick();    //˫���¼�
	public void rightClick();    //�һ��¼�
	
	
}



//������ģʽ���Ѳ����õĿ�ʵ�֣�
abstract class MouseListenerAdapter implements Mouselistener{
	
	public void rightClick() {}
	
	
}