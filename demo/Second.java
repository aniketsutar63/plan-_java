package demo;

public class Second {

	public static void main(String[] args) {


				
				//int[] array= {13,12,16,65,78,-243,543,-33};
				
				//int [] arr= {41,52,57,98,47,56,85,47,554,85,8,589,22,58,2,28,52,58,228,5,5,282,852,8,2,8,2558,};
				
		//int [] arr= {98,52,74,87,86,20};
				int []arr= {13,12,16,65,78,243,543,33};
				
				int num=Integer.MIN_VALUE;
				
				 int second; 
				 int third;
				 int fourth;
				 int fifth;  
				 int six;
				
				// int third=Integer.MIN_VALUE;
				
				// int fourth=Integer.MIN_VALUE;
				
				// int fifth=Integer.MIN_VALUE;
				
				// int six=Integer.MIN_VALUE;
				
				for(int i=0;i<arr.length;i++)
				{
					 second=Integer.MIN_VALUE;
					if(arr[i]>num)
					{
//						six=fifth;       // (543)
//						fifth = fourth;  // (543)
//		                fourth = third;  // (543)  in that condition only the num will be updated other can not be updated
//		                third = second; // (543)
						second = num;  // (543)
						num =  arr[i]; // (543)   in that you  have print the hight value in that next condition you mantion it in each if loop 
					//System.out.println(num);
						System.out.println("Highest:"+num);
					}
					 third=Integer.MIN_VALUE;
					if(arr[i]>second &&arr[i]<num)
					{
//						six=fifth;         // (243)
//						fifth = fourth;    // (243)
//		                fourth = third;    // (243)
		                third = second;   // (243)
						second = arr[i]; // (243)  remove the hight value you don't mation it hight value;
						System.out.println("Second:"+second);
					}
					
					 fourth=Integer.MIN_VALUE;
					if(arr[i] >third && arr[i] <second)
					{
//						six=fifth;		 //(78)
//						fifth = fourth;  //(78)
		                fourth = third;  //(78)
		                third = arr[i];  //(78)
		                System.out.println("Third:"+third);
					}
					 fifth=Integer.MIN_VALUE;
					if(arr[i] >fourth && arr[i]<third)
					{
//						six=fifth;       //(65)
						fifth=fourth;   //(65)
						fourth=arr[i]; //(65)
						System.out.println("Fourth:"+fourth);
					}
					 six=Integer.MIN_VALUE;
					if(arr[i]>fifth && arr[i]<fourth)
					{
						six=fifth;     //(33)
						fifth=arr[i];  //(33)
						System.out.println("fifth:"+fifth);
					}
					//int six=Integer.MIN_VALUE;
					if(arr[i]>six && arr[i]<fifth) {
						
						six=arr[i]; //(16)
						System.out.println("Six:"+six);
					}
				}
//				System.out.println("Highest:"+num);
//				System.out.println("Second:"+second);
//				System.out.println("Third:"+third);
//				System.out.println("Fourth:"+fourth);
//				System.out.println("fifth:"+fifth);
//				System.out.println("Six:"+six);
				
			}
			




	}


