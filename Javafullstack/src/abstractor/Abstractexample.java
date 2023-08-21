package abstractor;

abstract class bill
{
	int units=100;
	void show()
	{
		System.out.println("units:"+units);
	}
	abstract void bill_generation(); 
}
class dom extends bill
{
	void bill_generation()
	{
		float b=units*1.20f;
		System.out.println("bill:"+b);
	}
}
public class Abstractexample {

	public static void main(String[] args) {
		dom d=new dom();
		d.bill_generation();
		d.show();
	}
}
