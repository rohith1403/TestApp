package studentsscore;

import java.util.Scanner;

public class whilesummation10 {

	public static void main(String[] args) {
		int i=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		while(num>=i)
		{
			
			sum+=i;
			i++;
			
		}
		System.out.println(sum);
	}

}
