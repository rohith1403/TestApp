package controllstatments;

public class armstrongpr {

	public static void main(String[] args) 
	{
		int num,n,rem,sum=0;
		System.out.println("Armstrong numbers b/w 10 to 1000");
		for( num=10;num<1000;num++)
		{
			int count=0;
			n=num;
			while(n!=0)
			{
				count++;
				n/=10;
			}
			n=num;
			while(n!=0)
			{
				rem=n%10;
				sum+=Math.pow(rem, count);
				n/=10;
			}
			if(sum==num)
			{
				System.out.println(num);
			}
			sum=0;



		}

	}
}

