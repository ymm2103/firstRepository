package excise;

public class ArrayCopy {

	public static void main(String[] args) {
	
     int[] arr1 = {1,3,6,8};
     int[] arr2=new int[7];
      	
		
	//���ø��Ƶ�����
     arrayCopy(arr1,arr2);
		
	}

	
	  //�ѵ�һ�����鸴�Ƶ��ڶ���������
	public static void arrayCopy(int[] array1,int[] array2) {
		
		//�ضϸ���
		if(array1.length>=array2.length)
		{
			for(int i=0;i<array2.length;i++)
			{
				array2[i]=array1[i];
			}
		}
		
		
		//���Ƹ���
		else
		{
			for(int i=0;i<array2.length;i++)
			{
				array2[i]=array1[i%(array1.length)];
			}
			
		}
		
		
		//������ƺ������
		for(int i=0;i<array2.length;i++)
		
	{
			System.out.print(array2[i]+"\t");
	}
		
		
	}
	
	
	
}
