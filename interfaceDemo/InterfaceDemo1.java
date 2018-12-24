package interfaceDemo;

public class InterfaceDemo1 {

	public static void main(String[] args) {
	
		WomenStar ws=new WomenStar();
		
		Tuhao tuhao=new Tuhao();
		tuhao.marry(ws);
		
		
		KereanBoy kb=new KereanBoy();
		kb.white();
		
	}

}


//接口白
interface White{
	public void white();
}

//接口富
interface Rich{
	public  void rich();
}


//接口美
interface Beauty{
	public  void beauty();
}



//继承白富美接口
interface BFM extends White,Rich,Beauty{
	
}





//白富美类
class WomenStar implements BFM{
	public void white() {
		System.out.println("女明星很白");
	}
	
	public void rich() {
		System.out.println("女明星也很有钱");
	}
	
	
    public void beauty() {
	System.out.println("女明星也很漂亮");
    }
  	
}


//土豪类
class Tuhao{
	
	//结婚方法
	public void marry(BFM wfm) {
		wfm.white();
		wfm.rich();
		wfm.beauty();
	}
}



class KereanBoy implements White{
	
	public void white() {
		System.out.println("韩国男生很白");
	}
}



