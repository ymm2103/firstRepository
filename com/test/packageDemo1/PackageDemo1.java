package com.test.packageDemo1;

//����ָ������,*Ϊͨ�����ָ�������е���
import com.test.packageDemo2.*;     

public class PackageDemo1 {

	public static void main(String[] args) {
		System.out.println("package");
		
		//ͨ������������һ�����еķ���
		PackageDemo2.outPrint();
	}

	
}
