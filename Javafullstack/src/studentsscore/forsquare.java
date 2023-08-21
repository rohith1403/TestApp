package studentsscore;

import java.util.Scanner;

public class forsquare {

	public static void main(String[] args) {
		int b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		for(int i=0;i<=a;i++)
		{
			b=i*i;
			System.out.println("square of "+i+" ="+b);
		}


	}

}
