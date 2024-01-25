class Switch
{
	public static void main(String args[])
	{
		int month = 4;
		String season;
		switch(month)
		{
			case 12:
			case 1:
			case 2:
				season = "winter";
			case 3:
			case 4:
			case 5:
				season = "spring";
			case 6:
			case 7:
			case 8:
				season = "Summer";
			case 9:
			case 10:
			case 11:
				season = "autumn";
				break;
			default:
				season = "bogus month";
			
		}
		System.out.println("april is in the " +season + ".");
	}
}