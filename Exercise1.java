package day2;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
      System.out.println("Marks out of ");
      int marks=sc.nextInt();
      
      System.out.println("Enter first Subject Marks ");
      int mark1 =sc.nextInt();
      System.out.println("Enter second Subject Marks ");
      int mark2 =sc .nextInt();
      System.out.println("Enter Third Subject Marks ");
      int mark3 =sc.nextInt();
      System.out.println("Enter Fourth Subject Marks ");
      int mark4 =sc.nextInt();
      System.out.println("Enter Fiveth Subject Marks ");
      int mark5 =sc.nextInt();
      int sum=mark1+mark2+mark3+mark4+mark5;
      System.out.println("Total Marks"+sum);
      
      float per =(sum/500)*marks;
    	System.out.println(per);
      
      
		
		
		
	}

}
