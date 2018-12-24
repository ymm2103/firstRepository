package noNameDemo;

public class WindowDemo {

	public static void main(String[] args) {
 //匿名内部类对象，方法链编程
		new Window().addListener(new WindowAdapter() {
			public void max() {
				System.out.println("窗口最大化");
			}
			
			public void min() {
				System.out.println("窗口最小化");
			}
		}).winMax().winMin();         

	}

}


//定义接口
interface WindowListener{
	public void max();
	public void min();
	public void resize();
	public void restore();
	public void move();
	public void close();
}


//适配器
abstract class WindowAdapter implements WindowListener{
	
	public void resize() {}
	public void restore() {}
	public void move() {}
	public void close() {}
	
}




//Window类
class Window{
	private WindowListener w;       //接口类的私有变量
	
	public Window addListener(WindowListener w) {
		this.w=w;
		return this;                //返回自身；
	}
	
	
	//窗口最大化方法
	public Window winMax() {
		w.max();
		return this;
	}
	
	//窗口最小化方法
	public Window winMin() {
		w.min();
		return this;
	}
	
}

