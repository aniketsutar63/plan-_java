package Array;

public class Program2 {

	public static void main(String[] args) {

		int[] number= {10,20,30,40,50,60,70,80,90,100,200,300,400,500,600,700,800,900};
		 int largest=number[0];
		 for (int i=3;i<number.length;i++) {
			 if(number[i]>largest){
				 largest=number[i];
			 }
			 System.out.println("largest number is teh "+largest);
			 
		 }
	}

}
