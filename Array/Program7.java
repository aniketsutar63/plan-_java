package Array;

public class Program7 {

	public static void main(String[] args) {
				
				
		
		int [] arr= {12,34,43,21,43,43,67,87};
		
		
		
		int highest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		int third=Integer.MIN_VALUE;
		
		
		
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]>highest)
			{
				System.out.println("*"+second);
				second=highest;
				highest=arr[i];
			}
			
			if(arr[i]>second && arr[i]<highest)
			{
				System.out.println("&"+second);
				third=second;
				second=arr[i];
			}
			if(arr[i]>third && arr[i]<second)
			{
				third=arr[i];
			}
		}
		
		
		System.out.println("Highest:"+highest);
		System.out.println("Second:"+second);
		System.out.println("Third:"+third);
		
		
		
			}

		

	}


