package stringDemo;

import java.io.UnsupportedEncodingException;

public class StringDemo2 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str="a涓璪";
		

		byte[] bytes=str.getBytes("GBK");
		System.out.println(str.length());
		
		
		String newstr=new String(bytes,"GBK");
		System.out.println(newstr);
		
	}

}
