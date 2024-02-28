class Rectangle
{
	int length,width;
	void getdata(int x,int y)		//declaration of variable
	{
		length = x;
		width = y;
	}
	int rectArea()				//hithe declaration of method kela(function)
	{
		int area = length * width;
		return(area);
	}
	
}

class RectArea					//main method banvla
{
	public static void main(String args[])
	{
		int area1,area2;
		Rectangle rect1 = new Rectangle();		//object create kela
		Rectangle rect2 = new Rectangle();
		rect1.length = 15;				//access direct variable la kela
		rect2.width = 10;
		area1 = rect1.length * rect2.width;		
		rect2.getdata(20,12);				//access method la kela
		area2 = rect2.rectArea();			//variable chy working method acces
		System.out.println("Area1 = "+area1);
		System.out.println("Area2 = "+area2);
	}
}