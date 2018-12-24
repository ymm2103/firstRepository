package excise;

public class ThreeArrayOutput {

	public static void main(String[] args) {
       
	 //������ά����
	 int[][][] arr= {
			         {{1,2,3},
		             {4,5,6},
		             {7,8,9}},
			 
			        {{10,11,12},
			        {13,14,15},
			        {16,17,18}
			        },
			        
			        {{19,20,21},
			        {22,23,24},
			        {25,26,27}
			        }
			        };
	 
	 
	 //�����ά����
	 int[][] array= {{1,2,3},{4,5,6},{7,8,9}};
	 
	 
	 
	 
		//���������ά����
		ArrayOutput(arr);

		
		//���ú��������ά����
		threeArrayPrint(arr);
		System.out.println();
		
		thanslationThreeArrayPrint(array);
		//���þ���ת��
		thanslationThreeArray(array);
		
		//���ת�ú�ľ���
		thanslationThreeArrayPrint(array);
		
	}

	
	
	//��ά��������
	public static void ArrayOutput(int[][][] array)
	{

		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				for(int k=0;k<array[i][j].length;k++)
				{
					System.out.print(array[i][j][k]+"\t");
				}
				
				System.out.println();
			}
			
			System.out.println();
		}
	}
	
	
	
	//��ά����ĺ������
	public static void  threeArrayPrint(int[][][] arry) {
		
		//�������
		for(int j=0;j<arry[0].length;j++)
		{
			for(int i=0;i<arry.length;i++)
			{
				for(int k=0;k<arry[i][j].length;k++)
				{
					System.out.print(arry[i][j][k]+"\t");
				}
				
				System.out.print("\t");
			}
			
			System.out.println();
	
	    }
	
}	
	
	
	

	//��ά�����תֵ���������ת��
	public static void thanslationThreeArray(int[][] arr) {
		 
		 int temp=0;
	     for(int i=0;i<arr.length;i++)
	     {
	    	 for(int j=0;j<i;j++)
	    	 {
	    		 temp=arr[i][j];
	    		 arr[i][j]=arr[j][i];
	    		 arr[j][i]=temp;
	    	 }
	     }
	     
	 	System.out.println();
	}

	
	
	//�������
public static void thanslationThreeArrayPrint(int[][] arr) {
	 	
      for(int i=0;i<arr.length;i++)
      {
    	  for(int j=0;j<arr[i].length;j++)
    	  {
    		  System.out.print(arr[i][j]+"\t");
    	  }
    	  System.out.println();
      }
}

}