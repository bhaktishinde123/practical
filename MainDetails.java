class StudentDetails
{
	String stdname;
	int stdid;
	int stdclass;
	
	void putdetails(String name,int id ,int class)
	{
		stdname = name;
		stdid = id;
		stdclass = class
	}
	
	void details()
	{
		System.out.println("the name of student is"+" "+stdname);
		System.out.println("the id of the student id "+stdid);
		System.out.println("the class of the student is "+stdclass);
	}
}
class MainDetails
{
	public static void main(String args[])
	{
		StudentDetails obj = new StudentDetails();
		obj.putdetails("bhakti",1234,12)
		obj.details();
		//System.out.println("the details of the student are\n"+std1);
	}
}	