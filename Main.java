class Parent
{
	String stdname;
	int stdclass;
	int stdrollno;
	
	
	void maindetails()
	{
		System.out.println("the name of the student is"+stdname);
		System.out.print("the class of student is"+stdclass);
		System.out.println("the rollono of the student is"+stdrollno);

	}
}


class Child extends Parent
{
	void maindetails()
	{
		System.out.println("the name of the student is"+stdname);
		System.out.println("the rollno of the student is"+stdrollno);

	}
}
class Main
{
	public static void main(String args[])
	{
		Child obj = new Child();
		Parent obj1 = new Parent();
		obj.stdname = "bhakti";
		obj.stdclass = 12;
		obj.stdrollno = 11;

		obj.maindetails();
		obj1.maindetails();
	}
}