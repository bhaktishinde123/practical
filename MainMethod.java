class MethodOverLoading
{
	int add(int a,int b)
	{
		int result = a+b;
		return result;
	}
	double add(double a ,double b,int c)
	{
		double addition = a+b+c;
		return addition;
	}
}
class MainMethod
{
	public static void main(String args[])
	{
		MethodOverLoading obj = new MethodOverLoading();
		int r1 = obj.add(4,10);
		System.out.println(r1);
		double r2 = obj.add(8.3,7.2,3);
		System.out.println(r2); 
	}
}