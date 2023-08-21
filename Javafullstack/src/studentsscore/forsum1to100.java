package studentsscore;

import java.util.Scanner;

public class forsum1to100 {

	public static void main(String[] args) {
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int num=sc.nextInt();
		for(i=0;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of "+num+ " odd numbers:"+sum);

	}

	}


