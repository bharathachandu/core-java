class Bar
{
	static String name="New Wine Shop";
	static String ownerName="Bharath.A";
	static String wineBrands[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addWineBrands(String wine)
	{
		boolean isWineAdded=false;
		if(index<wineBrands.length)
		{
			if(wine!=null)
			{
				wineBrands[index]=wine;
				index++;
				isWineAdded=true;
			}
			else
			{
				System.out.println("please provide valid wine brand");
			}
		}
		else
		{
			System.out.println("oops..!Shop is full");
		}
	return isWineAdded;	
	}
	public static void getAllBrands()
	{	
		System.out.println("The Available Wine Brands are:");
		for(String wine:wineBrands)
		{
			System.out.println("Wine Brand:"+wine);
		}
	return;	
	}
	public static boolean updateWineBrand(String oldBrand,String newBrand)
	{
		boolean isWineUpdated=false;
		for(int i=0;i<wineBrands.length;i++)
		{
			if(wineBrands[i]==oldBrand)
			{
				wineBrands[i]=newBrand;
				isWineUpdated=true;
			}
		}
		if(isWineUpdated==false)
		{
			System.out.println("sorry new brand is not updated");
		}
	return isWineUpdated;	
	}

}