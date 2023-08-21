package abstractor;
abstract class A1{
	public abstract void show();
}
abstract class B1 extends A1
{
	public abstract void show ();
}
class C1 extends B1
{
public void show () 
{
	System.out.println("show mehod");
}
}
public class example2 {

	public static void main(String[] args) {
	C1 obj=new C1();
	obj.show ();
	}

}
