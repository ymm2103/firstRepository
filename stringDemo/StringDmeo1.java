package stringDemo;

import java.nio.charset.Charset;

public class StringDmeo1 {

	public static void main(String[] args) {
		String str="hello world world";
		
        System.out.println(str.length());
        
        
        System.out.println(str.charAt(1));
        
        
        for(int i=0;i<str.length();i++) {
        	System.out.println(str.charAt(i));
        }
        
        
        char[] strs=str.toCharArray();
        
        
        int location=str.indexOf("world");
        System.out.println(location); 
        
        
        int loca=str.indexOf("world",7);   
        
        String s1="3Day";
        String s2="3Month";
        String s3="3Year";
        
        System.out.println(s1.endsWith("Day"));
        
       
        System.out.println(s1.startsWith("3"));
        
        String s="hello,,,world,world,";
        String[] strArr=s.split(",");
        System.out.println(strArr.length);
        
        
        System.out.println(str.substring(0,4));
       
        System.out.println(str.substring(0, str.length()));
         
        char a=97;
        a='a';
        a='\uFFFF';					
        a=0xffff;
        int ii=5;   	 			
        ii=05;						
        ii=0x5;						
        System.out.println(a);
        
        
     /*   //打印utf-8所有字符
        int col=0;
        for(int i=0;i<0xffff;i++) {
        	System.out.print((char)i);
        	col++;
        	if(col>=80) {
        		col=0;
        		System.out.println();
        	}
        }*/
        
        
        
        
        str="ab中国c";
       byte[] bytes=str.getBytes();
       System.out.println(bytes);
       System.out.println(Charset.defaultCharset().name());
        
        
	}

}
 