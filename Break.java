class Break
{
	public static void main(String args[])
	{
		boolean t = true;
		
		first:{
			second:{
				third:{
					System.out.println("Before the break");
					if(t) break second;
					System.out.println("this wont't executed");
					}
					System.out.println("this won't executed");
					}
					System.out.println("this is after second block");
	}
}
}