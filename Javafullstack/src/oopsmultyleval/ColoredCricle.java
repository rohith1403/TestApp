package oopsmultyleval;

class shape
{
	void draw()
	{
		System.out.println("Draw circle");
	}
}
class cricle extends shape
{
	void drawcricle()
	{
		System.out.println("drawing cricle");
	}
}
public class ColoredCricle extends cricle 
{
	void setColor(String color)
	{
		System.out.println("Color of cricle is "+color);
	}

	public static void main(String[] args) 
	{
		ColoredCricle cc=new ColoredCricle();
		cc.draw();
		cc.drawcricle();
		cc.setColor("Red");
	}

}
