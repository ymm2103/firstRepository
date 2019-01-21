package stringDemo;

public class StringDemo6 {

	public static void main(String[] args) {
		for(int i=0;i<=0xffff;i++) {
			if((char)i=='杨') {
				System.out.println("杨的编码值是："+i);
				System.out.println("杨的16进制编码值是:"+Integer.toHexString(i));
				
			}
			if((char)i=='蒙') {
				System.out.println("蒙的编码值是："+i);
				System.out.println("蒙的16进制编码值是:"+Integer.toHexString(i));
				
				
				
				
				String str="杨蒙蒙";
				for(int j=0;j<str.length();j++) {
					System.out.println(Integer.toHexString(str.codePointAt(j)));  //codePointAt是获取字符数组元素的的代码点
				}
		
				
				
			}
				
		}

	}

}
