package studentsscore;
import java.util.Scanner;
public class dowhiletable {

	public static void main(String[] args)
	{
		int a,i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int num=sc.nextInt();
		do
		{
			a=num*i;
			System.out.println(num+"*"+i+"="+a);
			i++;
		}
		while(10>=i);

	}

}
