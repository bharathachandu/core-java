class Shoe
{
	static String name="Shoe Shop";
	static String ownerName="Bharath.A";
	static String shoeBrands[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addShoeBrands(String shoe)
	{
		boolean isShoeAdded=false;
		if(index<shoeBrands.length)
		{
			if(shoe!=null)
			{
				shoeBrands[index]=shoe;
				index++;
				isShoeAdded=true;
			}
			else
			{
				System.out.println("please provide valid shoe brand");
			}
		}
		else
		{
			System.out.println("oops..!Shop is full");
		}
	return isShoeAdded;	
	}
	public static void getAllShoeBrands()
	{	
		System.out.println("The Available Shoe Brands are:");
		for(String shoe:shoeBrands)
		{
			System.out.println("Shoe Brand:"+shoe);
		}
	return;	
	}
	public static boolean updateShoeBrand(String oldBrand,String newBrand)
	{
		boolean isShoeUpdated=false;
		for(int i=0;i<shoeBrands.length;i++)
		{
			if(shoeBrands[i]==oldBrand)
			{
				shoeBrands[i]=newBrand;
				isShoeUpdated=true;
			}
		}
		if(isShoeUpdated==false)
		{
			System.out.println("sorry new brand is not updated");
		}
	return isShoeUpdated;	
	}

}