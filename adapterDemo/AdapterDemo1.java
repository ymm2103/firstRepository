package adapterDemo;

public class AdapterDemo1 {

	public static void main(String[] args) {
		
		
		Button b1=new  Button();
		//�����ڲ������,��ʵ�ֽӿ������з�����
		b1.addListener(new MouseAdapter() {
			public void onClick() {
				System.out.println("b1����");
			}	
		});
		
		
	    b1.click();
	    b1.dbClick();
	    
	    
	    
		Button b2=new  Button();
		//�����ڲ������,��ʵ�ֽӿ������з�����
		b2.addListener(new MouseAdapter() {
			public void onClick() {
				System.out.println("b2����");
			}
			
		});
		
		
	    b2.click();
	    b2.dbClick();
	    
	    
	    
	 //������ʽ���(��this������)
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
    return this;   //��������
    
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


//������ģʽ��ʵ�ֲ����õķ�����
abstract class MouseAdapter implements MouseListener{
	
	public void onDbClick() {}
	public void onRightClick() {}
	public void onMiddleClick() {}
}



