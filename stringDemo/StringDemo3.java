package stringDemo;

import java.io.UnsupportedEncodingException;

public class StringDemo3 {

	public static void main(String[] args) throws UnsupportedEncodingException {
	
		String str="a中b";
		
		//utf-8下，中-->-28,-72,-83,使用3个字节存放一个中文字符
		//byte[] arr=str.getBytes("utf-8");
		
		//GBK下，中-->-42,-48,使用2个字节存放一个中文字符
		//byte[] arr=str.getBytes("GBK");
		
		//iso8859-1下，中-->63,使用一个字节存放一个中文字符
		//byte[] arr=str.getBytes("iso8859-1");
		//System.out.println((char)63);
		
		//big5下，中-->-92,-92,使用两个字节存放一个中文字符
		byte[] arr=str.getBytes("big5");
		byte[] big5={-92,-92};
		System.out.println(new String(big5,"big5"));
		
		
		//\u570b是繁体國
		String guo="\u570b";
			
		//utf-8:國,-27 -100 -117,3个字节表示
		arr=guo.getBytes("utf-8");
		
		//big5：國，-80，-22,2个字节表示
		arr=guo.getBytes("big5");
		//new String(),通过字符集对byte[]进行解码，转变成字符串
		System.out.println(new String(new byte[] {-80,-22},"big5"));
		
		String asc="abcde";
		System.out.println(new String(asc.getBytes("big5"),"iso-8859-1"));
		
     
	}

}
