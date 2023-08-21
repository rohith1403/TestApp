package studentsscore;

import java.util.Scanner;

public class whilesubraction {

	public static void main(String[] args) {
		int i=20,sub=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();//30
		while(num>i)
		{
			sub=num-i;
			i++;
		}
		System.out.println(sub);

	}

}
