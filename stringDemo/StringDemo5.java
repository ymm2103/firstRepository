package stringDemo;

public class StringDemo5 {

	public static void main(String[] args) {
		try {
			StringBuffer buffer=new StringBuffer();
	    /* for(int i=1;i<=100;i++) {
	    		buffer.append(i);
	        }
	        System.out.println(buffer.toString());*/
			
			//追加字符串
	        buffer.append("abc中国人def"); 
	        System.out.println(buffer.toString());
	        
	        //输出指定字符
	        System.out.println(buffer.charAt(4));
	        
	        //删除指定字符，前包后不包
	        System.out.println(buffer.delete(4, 6));    
	        
	        //插入指定字符串,6是偏移量
	        System.out.println(buffer.insert(6, "哈哈"));  
	        
	        //取子串，前包后不包
	        System.out.println(buffer.substring(3, 7));
	        
	        //倒置
	        System.out.println(buffer.reverse());
	        
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		/*String temp="";
		for(int i=1;i<=10000;i++) {
			temp=temp+i;
		}
		System.out.println(temp);
		System.out.println("over");*/
		
		
	}

}
