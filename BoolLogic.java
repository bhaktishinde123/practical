class BoolLogic
{
	public static void main(String args[])
	{
		boolean a,b,c,d,e,f,g;
		a = true;
		b = false;
		c = a|b;
		d = a&b;
		e = a ^ b;
		f = (!a & b) | (a & !b);
		g = !a;
		
		System.out.println("a="+a + " " + "b="+b +" " + "c="+c  + " " + "d="+d +" " +"e=" +e + " " + "f="+f + " " + "g="+g);

		
	}
}