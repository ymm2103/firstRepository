package shuZhuPaiXu;

public class ShuZhuPaiXu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//冒泡排序，外层循环是比较了多少遍，内层循环是每层比较的次数
		int[] arry= {13,35,-15,87,98,104,23,76,0};
		
		
		int temp=0;
		for(int i=0;i<arry.length-1;i++)           //外层循环i次
		{
			
			for(int j=0;j<arry.length-1-i;j++)    //内层循环8-i次
			{
				if(arry[j]>arry[j+1])
				{
					temp=arry[j];
					arry[j]=arry[j+1];
					arry[j+1]=temp;
					
				}
				
			}
		}
		
		
		for(int i=0;i<arry.length;i++)
		{
			
			System.out.print(arry[i]+"\t");
		}
		
		
		System.out.println();
		
		//增强for循环
		for(int i:arry)
		{
			System.out.print(i+"\t");
			
		}
		
	
		
		
		
		
		
		
	    //选择排序法，把前面的元素和后面的元素依次比较
		for(int i=0;i<arry.length-1;i++)
		{
			for(int j=i+1;j<arry.length;j++)
			{
				if(arry[i]>arry[j])
				{
					temp=arry[i];
					arry[i]=arry[j];
					arry[j]=temp;
					
				}
			}
			
		}
	
		
		
	   System.out.println();
		
		//增强for循环
		for(int i:arry)
		{
			System.out.print(i+"\t");
			
		}
		
	    System.out.println();	
		

	
		
//折半查找，二分法查找HalfFind
	int[] array= {1,3,7,19,32,34,56,64,78,98};	
	
	int min=0;
	int max=array.length-1;
	
	int num=19;
	int index=-1;

	
	while(min<=max)
	{
		int mid=(max+min)/2;
		
		//找到了
		if(num==array[mid])
		{
			index=mid;
			break;
		}
		
		//落在左半边
		else if(num<array[mid])
		{	
			max=mid-1;		
		}
		
		//落在右半边
		else
		{
			min=mid+1;
		}	
		
	}
		
	System.out.println(index);	
		
	}

}
