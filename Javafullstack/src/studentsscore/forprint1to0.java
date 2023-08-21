package studentsscore;

import java.util.Scanner;

public class forprint1to0 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		int num=sc.nextInt();
		for(int i=1;num>=i;i++)
		{
			System.out.println(i);
		}


	}

}
