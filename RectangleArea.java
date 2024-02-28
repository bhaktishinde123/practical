class Rectangle
{
	int length,width;
	Rectangle(int x,int y)	//hite  parameterized constructor create kela
	{
		length = x;	
		width = y;
		
	}
	int rectArea()		//method create kela
	{
		return (length * width);
	}
}
class RectangleArea
{
	public static void main(String args[])
	{
		Rectangle rect1 = new Rectangle(15,10);//hite constructor call kela withhelpofobject
		int area1 = rect1.rectArea();
		System.out.println("Area1 = "+area1);	
	}
}