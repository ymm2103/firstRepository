package shuZhuPaiXu;

public class ShuZhuPaiXu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//ð���������ѭ���ǱȽ��˶��ٱ飬�ڲ�ѭ����ÿ��ȽϵĴ���
		int[] arry= {13,35,-15,87,98,104,23,76,0};
		
		
		int temp=0;
		for(int i=0;i<arry.length-1;i++)           //���ѭ��i��
		{
			
			for(int j=0;j<arry.length-1-i;j++)    //�ڲ�ѭ��8-i��
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
		
		//��ǿforѭ��
		for(int i:arry)
		{
			System.out.print(i+"\t");
			
		}
		
	
		
		
		
		
		
		
	    //ѡ�����򷨣���ǰ���Ԫ�غͺ����Ԫ�����αȽ�
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
		
		//��ǿforѭ��
		for(int i:arry)
		{
			System.out.print(i+"\t");
			
		}
		
	    System.out.println();	
		

	
		
//�۰���ң����ַ�����HalfFind
	int[] array= {1,3,7,19,32,34,56,64,78,98};	
	
	int min=0;
	int max=array.length-1;
	
	int num=19;
	int index=-1;

	
	while(min<=max)
	{
		int mid=(max+min)/2;
		
		//�ҵ���
		if(num==array[mid])
		{
			index=mid;
			break;
		}
		
		//��������
		else if(num<array[mid])
		{	
			max=mid-1;		
		}
		
		//�����Ұ��
		else
		{
			min=mid+1;
		}	
		
	}
		
	System.out.println(index);	
		
	}

}
