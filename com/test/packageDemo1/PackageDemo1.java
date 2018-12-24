package com.test.packageDemo1;

//导入指定的类,*为通配符，指包下所有的类
import com.test.packageDemo2.*;     

public class PackageDemo1 {

	public static void main(String[] args) {
		System.out.println("package");
		
		//通过类来访问另一个包中的方法
		PackageDemo2.outPrint();
	}

	
}
