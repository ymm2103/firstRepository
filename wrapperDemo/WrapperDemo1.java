package wrapperDemo;

public class WrapperDemo1 {
public static void main(String[] args) {
	Byte b=new Byte((byte)15);
	System.out.println(Byte.MAX_VALUE);
	System.out.println(Byte.MIN_VALUE);
	
	//转16进制
	System.out.println(Integer.toHexString(100));
	
	Short s=new Short((short)12);
	
	Integer i=new Integer(12);
	
	Long l=new Long(12);
	long ll=100l;
	
	float f=100f;
	
	
	Boolean bl=new Boolean(true);
	bl.booleanValue();
	
	Float ff=new Float(1234f);
	Double d=new Double(123.45f);
    Character c=new Character('A');
    c.toString();
    
    
    Integer.toString(3);
    
    
    //字符串转整数
    Integer i0=Integer.parseInt("123");
    
    
    //包装类转化为整数
    Integer i2=new Integer(13);
    int ii2=i2.intValue();
	
    
    //包装类参与运算，自动拆箱
    Integer i3=15;
    Integer i4=16;
    System.out.println(i3+i4);
	
	
    
   Integer itmp=null;
   System.out.println((itmp==null?0:itmp)+100);
	
	
}
}
