package Throwskeyword;

public class Throw {
public void show() {
	int age=20;
	if (age<22) {
		throw new ArithmeticException ("Age should be grater than 22");
	}
}
	public static void main(String[] args) {
	Throw o=new Throw();
	o.show();
	}

}
