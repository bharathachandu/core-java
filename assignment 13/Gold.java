class Gold
{
	static String name="Sri Annapoorneshwari Golds";
	static String ownerName="Bharath.A";
	static String goldItemNames[]={null,null,null,null,null,null,null};
	static int index;

	public static boolean addGoldItem(String goldItemName)
	{
		boolean isGoldItemAdded=false;
		System.out.println("Adding Gold Items to the ShowRoom Started");
		if(index < goldItemNames.length)
		{	
			if(goldItemName!=null)
			{
				goldItemNames[index]=goldItemName;
				index++;
				isGoldItemAdded=true;
			}
			else
			{
				System.out.println("please provide valid Gold Item name");
			}
		}
		else
		{
			System.out.println("Gold Show Room is Full no Space for other gold items");
		}
		System.out.println("Adding Gold Items to the ShowRoom Ended");
		return isGoldItemAdded;
	}

	public static void getAllGoldItems()
	{
		System.out.println("The Gold Items Details are:");
		for(String goldName:goldItemNames )
		{
			System.out.println("Gold Item Name :"+goldName);
		}
		return;

	}
	public static boolean updateGoldItem(String oldGold,String newGold)
	{
		boolean isGoldUpdated = false;
		for(int j=0;j<goldItemNames.length;j++)
		{
			if(oldGold==goldItemNames[j])
			{
				goldItemNames[j]=newGold;
				isGoldUpdated=true;
			}
		}	
			if(isGoldUpdated==false)
			{
				System.out.println(oldGold+" not found");
			}
		return isGoldUpdated;
	}
	
}


