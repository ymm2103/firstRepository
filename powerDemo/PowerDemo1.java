package powerDemo;

 class PowerDemo1 {

	public static void main(String[] args) {
		
		//���ð���������
		PowerDemo2 demo=new PowerDemo2();
		demo.sayhello("helloPowerDemo2");
		
		//���ð��������������
		SubPowerDemo2 demo2 =new SubPowerDemo2();
		demo2.sayhello("helloSubPowerDemo2");
		demo2.outPrint();
		
		
		B b=new B();
		b.PrintOutB();
		
		
	}
		

}
 
 
 
 class A{
	 void PrintOutA() {
		 System.out.println("���A");
	 }
 }
 
 
 class B extends A{
	 void PrintOutB() {
		 super.PrintOutA();
	 }
 }

 
 
 
 

