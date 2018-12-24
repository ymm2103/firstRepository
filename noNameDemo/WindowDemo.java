package noNameDemo;

public class WindowDemo {

	public static void main(String[] args) {
 //�����ڲ�����󣬷��������
		new Window().addListener(new WindowAdapter() {
			public void max() {
				System.out.println("�������");
			}
			
			public void min() {
				System.out.println("������С��");
			}
		}).winMax().winMin();         

	}

}


//����ӿ�
interface WindowListener{
	public void max();
	public void min();
	public void resize();
	public void restore();
	public void move();
	public void close();
}


//������
abstract class WindowAdapter implements WindowListener{
	
	public void resize() {}
	public void restore() {}
	public void move() {}
	public void close() {}
	
}




//Window��
class Window{
	private WindowListener w;       //�ӿ����˽�б���
	
	public Window addListener(WindowListener w) {
		this.w=w;
		return this;                //��������
	}
	
	
	//������󻯷���
	public Window winMax() {
		w.max();
		return this;
	}
	
	//������С������
	public Window winMin() {
		w.min();
		return this;
	}
	
}

