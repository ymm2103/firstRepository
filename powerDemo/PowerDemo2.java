package powerDemo;

 class PowerDemo2 {
	protected void sayhello(String msg){
		System.out.println(msg);
	}
}



//всюЮ
class SubPowerDemo2 extends PowerDemo2{
	
	void outPrint() {
		super.sayhello("subPowerDemo2");
	}
}
