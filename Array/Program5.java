package Array;

public class Program5 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 33, 58, 75, 69, 74};

        int num = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int fourth = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                //fourth = third;
                //third = second;
                second = num;
                num = arr[i];
            }  
            if (arr[i] > second && arr[i] < num) {
                //fourth = third;
                third = second;
                second = arr[i];
            }
            if (arr[i] > third && arr[i] < second) {
                fourth = third;
                third = arr[i];
            } 
            if (arr[i] > fourth && arr[i] < third) {
                fourth = arr[i];
            }
        }

        System.out.println("largest value " + num);
        System.out.println("second largest value " + second);
        System.out.println("third largest value " + third);
        System.out.println("fourth largest value " + fourth);
    }
}
