package studentsscore;
import java.util.Scanner;
public class studentsscore
{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your data");
		String name,rollnum;
		int marks;
		name=sc.next();
		rollnum=sc.next();
		marks=sc.nextInt();
		System.out.println(name);
		System.out.println(rollnum);
		System.out.println(marks);
	}

}
