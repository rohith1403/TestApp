package studentsscore;

import java.util.Scanner;

public class forsumavg5 {

	public static void main(String[] args) {
		int a,sum=0,avg=0;
		Scanner sc=new Scanner(System.in);
		for(a=1;a<=5;a++)
		{
			System.out.println("enter number:");
			int i=sc.nextInt();
			sum=sum+i;
		}
		avg=sum/5;
		System.out.println("sum of numbers:"+sum);
		System.out.println("average of numbers:"+avg);


	}

}
