package Array;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		 char[] names=new char[5];
		 char[] names1=new char[5];
		 names[0]='A';
		 names[1]='B';
		 names[2]='C';
		 names[3]='D';
		 names[4]='E';
		 
		 names1[0]='a';
		 names1[1]='b';
		 names1[2]='c';
		 names1[3]='d';
		 names1[4]='e';
		 
		 
		 System.out.println(" 1 =  A ");
		 System.out.println(" 2 =  B ");
		 System.out.println(" 3 =  C ");
		 System.out.println(" 4 =  D ");
		 System.out.println(" 5 =  E ");
		 System.out.println("Enter the  Letter number");
		 int number=sc.nextInt();
		  switch(number) {
		  case 1:
			  System.out.println("A is the upper case");
			  System.out.println(" Enter the ASCII value");
			  int number1 =sc.nextInt();
			  if(number1==65) {
				  System.out.println("that is the correct ASCII value of A :: "+number1);
				  
			  }else {
				  System.out.println("that is the not  correct ASCII value of A plese try again");
			  }
			  break;
		  case 2:
			  System.out.println("B is the upper case");
			  System.out.println("ASCII value");
			  int number2 =sc.nextInt();
			  if(number2==66) {
				  System.out.println("that is the correct ASCII value of B :: "+number2);
				  
			  }else {
				  System.out.println("that is the not  correct ASCII value of B plese try again");
			  }
			  break;
		  case 3:
			  System.out.println("C is the upper case");
			  System.out.println("ASCII value");
			  int number3 =sc.nextInt();
			  if(number3==66) {
				  System.out.println("that is the correct ASCII value of C :: "+number3);
				  
			  }else {
				  System.out.println("that is the not  correct ASCII value of C plese try again");
			  }
			  break;
		  case 4:
			  System.out.println("D is the upper case");
			  System.out.println("ASCII value");
			  int number4 =sc.nextInt();
			  if(number4==67) {
				  System.out.println("that is the correct ASCII value of D :: "+number4);
				  
			  }else {
				  System.out.println("that is the not  correct ASCII value of D plese try again");
			  }
			  break;
		  case 5:
			  System.out.println("E is the upper case");
			  System.out.println("ASCII value");
			  int number5 =sc.nextInt();
			  if(number5==68) {
				  System.out.println("that is the correct ASCII value of E :: "+number5);
				  
			  }else {
				  System.out.println("that is the not  correct ASCII value of E plese try again");
			  }
		 break;
		
		  default:
              System.out.println("Invalid  choice !");
		  }

	 
		 
	}

}
