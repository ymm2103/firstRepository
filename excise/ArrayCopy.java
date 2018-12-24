package excise;

public class ArrayCopy {

	public static void main(String[] args) {
	
     int[] arr1 = {1,3,6,8};
     int[] arr2=new int[7];
      	
		
	//调用复制的数组
     arrayCopy(arr1,arr2);
		
	}

	
	  //把第一个数组复制到第二个数组里
	public static void arrayCopy(int[] array1,int[] array2) {
		
		//截断复制
		if(array1.length>=array2.length)
		{
			for(int i=0;i<array2.length;i++)
			{
				array2[i]=array1[i];
			}
		}
		
		
		//回绕复制
		else
		{
			for(int i=0;i<array2.length;i++)
			{
				array2[i]=array1[i%(array1.length)];
			}
			
		}
		
		
		//输出复制后的数组
		for(int i=0;i<array2.length;i++)
		
	{
			System.out.print(array2[i]+"\t");
	}
		
		
	}
	
	
	
}
