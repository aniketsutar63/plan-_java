package Array;

public class Program6 {

	public static void main(String[] args) {		
		        int[] arr = {10, 20, 33, 58, 75, 69, 74};

		        // Initialize
		        int first = Integer.MIN_VALUE;
		        int second = Integer.MIN_VALUE;
		        int third = Integer.MIN_VALUE;
		        int fourth = Integer.MIN_VALUE;

		        // Loop through array
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] > first) {
		                // shift down
		                fourth = third;
		                third = second;
		                second = first;
		                first = arr[i];
		            } 
		            if (arr[i] > second && arr[i] < first) {
		                //fourth = third;
		                third = second;
		                second = arr[i];
		            } 
		            if (arr[i] > third && arr[i] < second) {
		                fourth = third;
		                third = arr[i];
		            } 
		            if(arr[i] > fourth && arr[i] < third) {
		                fourth = arr[i];
		            }
		        }

		        // Print results
		        System.out.println("Largest value: " + first);
		        System.out.println("Second largest value: " + second);
		        System.out.println("Third largest value: " + third);
		        System.out.println("Fourth largest value: " + fourth);
		    }
		

	}


