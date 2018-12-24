package calDemo;

public class CalDemo {

	public static void main(String[] args) {
	 int a=+5;
	 int b=-5;
	 System.out.println("a+b="+(a+b));	
	 System.out.println(a+(-b));
	 
	 //双或
	 System.out.println(true||false);
	 
	 //双与
	 System.out.println( (a>0)&&(b>0));
	 
	 //按位与
	 System.out.println(5 & 6);
	 
	 //按位或
	 System.out.println(5 | 6);
	 
	 //取反
	 System.out.println(!true);
	 
	 //二进制按位取反
	 System.out.println(~5);
	 
	 //比较运算符
	 System.out.println(5!=5);
	 
	 //非运算符
	 System.out.println(!true);
	 
	 //instance of判断对象是否是指定的类型
	 Object o="hello";
	 System.out.println(o instanceof Object);   //true
	 System.out.println(o instanceof String);	//true
	 System.out.println(o instanceof Class);	//false
	 
	 //左移
	 System.out.println(5 << 2);
	 
	 //无符号右移，左边用0补充
	 System.out.println(5 >> 2);

	 //异或
	 System.out.println(5 ^ 6);
	 
	 //按位取反
	 System.out.println(~5);
	 
	}

}
