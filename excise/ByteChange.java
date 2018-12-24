package excise;

public class ByteChange {

	public static void main(String[] args) {
		
	//将一个自己Byte(-128~127)转换成0-255之间的整数	
		byte b=-100;
		int i=b & 0xff;
		System.out.println(i);
		
	}	
}
