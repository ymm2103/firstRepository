package noNameDemo;

public class NoNameDemo2 {

	public static void main(String[] args) {
	
	Button b1=new Button();
	 
	
	//匿名内部类作为参数
/*	b1.addListener(new Mouselistener() {
		public void onClick() {
			System.out.println("单击一下");
		}
		
		public void onDbClick() {
			System.out.println("双击一下");
		}
		
		public void rightClick() {
			System.out.println("右击一下");
		}
		
	});
	
	b1.click();
	b1.dbClick();*/
	
	
	
	//采用适配器模式
	b1.addListener(new MouseListenerAdapter() {
		public void onClick() {
			System.out.println("单击一下");
		}
		
		public void onDbClick() {
			System.out.println("双击一下");
		}	
	});
	
	b1.click();
	b1.dbClick();

	}

}




//按钮类
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




 //鼠标监听器接口
interface Mouselistener{
	public void onClick();      //单击事件
	public void onDbClick();    //双击事件
	public void rightClick();    //右击事件
	
	
}



//适配器模式，把不常用的空实现；
abstract class MouseListenerAdapter implements Mouselistener{
	
	public void rightClick() {}
	
	
}