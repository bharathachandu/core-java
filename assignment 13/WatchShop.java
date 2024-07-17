class WatchShop
{
	static String name="Sri Annapoorneshwari Watch Shop";
	static String ownerName="Bharath.A";
	static String watchNames[]={null,null,null,null,null,null,null,null,null,null};
	static int index;
	public static boolean addWatchBrandNames(String watchName)
	{
		boolean isWatchAdded=false;
		if(index<watchNames.length)
		{
			if(watchName!=null)
			{
				watchNames[index]=watchName;
				index++;
				isWatchAdded=true;
			}
			else
			{
				System.out.println("please enter valid watch name");
			}
		}
		else
		{
			System.out.println("Oops...!Show room is full no more watches can be added");
		}
	return isWatchAdded;	
	}
	public static void getAllWatchBrands()
	{	System.out.println("The Available Watch Brands are:");
		for(String watchBrand:watchNames)
		{
			System.out.println("Watch Brand Name:"+watchBrand);
		}
	return;	
	}
	public static boolean updateWatchBrands(String oldBrand,String newBrand)
	{	boolean isWatchUpdated=false;
		for(int i=0;i<watchNames.length;i++)
		{
			if(watchNames[i]==oldBrand)
			{
				watchNames[i]=newBrand;
				isWatchUpdated=true;
			}
		}
		if(isWatchUpdated==false)
		{
			System.out.println("Sorry watch Brand is not updated");
		}
	return isWatchUpdated;	
	}
}