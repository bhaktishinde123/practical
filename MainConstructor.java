class DiffConstructor
{
	int a,b;
	DiffConstructor()
	{
		a =10;
		b =20;
	}
	DiffConstructor(int x,int y)
	{
		a = x;
		b = y;
	}
	DiffConstructor(DiffConstructor other)
	{
		this.a=other.a;
		this.b=other.b;	
	}
	int add()
	{
		return a+b;
	}
}
class MainConstructor
{
	public static void main(String args[])
	{
		DiffConstructor obj1 = new DiffConstructor();
		System.out.println("Default constructor =" +obj1.add());
		DiffConstructor obj2 = new DiffConstructor(34,57);
		System.out.println("Overloaded constructor = "+obj2.add());
		DiffConstructor obj3 = new DiffConstructor(obj2);
		System.out.println("copy Constructor ="+obj3.add());
	}
}