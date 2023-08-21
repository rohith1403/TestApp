package arrays;

import java.util.Scanner;

public class library123 {

	public static void main(String[] args) 
	{
		 int days;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number of days is late to return the book:");
		 days=sc.nextInt();
		 if(days>0 && days<=5)
		 {
			System.out.println("The fine for late is 0.50 paise");
		 }
		 else if(days>5&&days<=10)
		 {
			 System.out.println("The fine for late is 1 rupee");
		 }
		 else if(days>10&&days<=30)
		 {
			 System.out.println("The fine for late is  5 rupee");
		 }
		 else if(days>30)
		 {
			 System.out.println("library membership will be cancelled.");
		 }
		 else 
		 {
			 System.out.println("invaild option!");
		 }
		 
	}
}
