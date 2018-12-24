package adapterDemo;

public class AdapterDemo1 {

	public static void main(String[] args) {
		
		
		Button b1=new  Button();
		//匿名内部类对象,须实现接口中所有方法；
		b1.addListener(new MouseAdapter() {
			public void onClick() {
				System.out.println("b1单击");
			}	
		});
		
		
	    b1.click();
	    b1.dbClick();
	    
	    
	    
		Button b2=new  Button();
		//匿名内部类对象,须实现接口中所有方法；
		b2.addListener(new MouseAdapter() {
			public void onClick() {
				System.out.println("b2单击");
			}
			
		});
		
		
	    b2.click();
	    b2.dbClick();
	    
	    
	    
	 //方法链式编程(对this的运用)
	  new Button().addListener(new MouseAdapter() {
		  public void onClick() {
			  System.out.println("new onClick's click");
		  }
		  
		  public void onDbClick() {
			  System.out.println("onDbClick's clck");
		  }
	  }).click().dbClick();
	    
	    
	    
		
	}

}


class Button{
	
	private MouseListener m1;
	
	public Button addListener(MouseListener m1) {
    this.m1=m1;
    return this;   //返回自身
    
	}
	
	
	public Button click() {
		m1.onClick();
		return this;
	}	
	
	public void dbClick() {
		m1.onDbClick(); 
		
	}
	
}



interface MouseListener{
	public void onClick();
	public void onDbClick();
	public void onRightClick();
	public void onMiddleClick();
}


//适配器模式，实现不常用的方法；
abstract class MouseAdapter implements MouseListener{
	
	public void onDbClick() {}
	public void onRightClick() {}
	public void onMiddleClick() {}
}



