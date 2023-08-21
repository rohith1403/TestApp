package largestnumber;

import java.util.Scanner;

public class largestnumber {
 public static void main (String[] args)
 {
	 Scanner sc=new Scanner (System.in);
	 System.out.println("enter your input:");
	 int num=sc.nextInt();
	 if (num%2==0)
	 {
		 System.out.println("number is even");
	 }
	 else
	 {
		 System.out.println("number is odd");
	 }
 }
}