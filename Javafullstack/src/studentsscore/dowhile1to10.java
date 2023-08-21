package studentsscore;
import java.util.Scanner;
public class dowhile1to10 {

	public static void main(String[] args)
	{
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		do
		{
			System.out.println(i);
			i++;
		}
		while(num>=i);
		

	}

}
