package studentsscore;

import java.util.Scanner;

public class prefectnumber {

	public static void main(String[] args) {
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number:");
		int num=sc.nextInt();
		for(i=1;num>i;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
			
		}
		if(sum==num)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("Not perfect number");
		}
	}

	}


