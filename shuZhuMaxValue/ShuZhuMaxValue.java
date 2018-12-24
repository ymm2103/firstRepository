package shuZhuMaxValue;

public class ShuZhuMaxValue {

	public static void main(String[] args) {
	
		int[] array={1,3,4,59,64,56,34,23,45,67};		

		
		System.out.println("数组的最大值是"+MaxValue(array));
		System.out.println("数组最大值是"+getMax(array));
		
	}
	

	
	
	
	
public static int MaxValue(int[] arr)
		{
	
	int max=arr[0];
	
	for(int i=0;i<arr.length;i++)
	{
       if(arr[i]>max)
       {
        max=arr[i];
       }

	}
	
	return max;
		}
	
	
	



public static int getMax(int[] arr){

	 if(arr==null || arr.length==0)
	 {return -1;}
	 
	 
	 else
	 {
		int max=0;
		for(int i=0;i<arr.length;i++)
		{	
		  max=max>arr[i]?max:arr[i];
		}
		
		return max;
		
	 }


	}
		
}



