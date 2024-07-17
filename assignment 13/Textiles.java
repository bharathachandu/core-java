class Textiles
{
	static String name="Textiles Shop";
	static String ownerName="Bharath.A";
	static String textileBrands[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addMaterial(String textile)
	{
		boolean isTextileAdded=false;
		if(index<textileBrands.length)
		{
			if(textile!=null)
			{
				textileBrands[index]=textile;
				index++;
				isTextileAdded=true;
			}
			else
			{
				System.out.println("please provide valid Textile brand");
			}
		}
		else
		{
			System.out.println("oops..!Shop is full");
		}
	return isTextileAdded;	
	}
	public static void getAllMaterialInfo()
	{	
		System.out.println("The Available Textile Brands are:");
		for(String textile:textileBrands)
		{
			System.out.println("Textile Brand:"+textile);
		}
	return;	
	}
	public static boolean updateMaterial(String oldBrand,String newBrand)
	{
		boolean isTextileUpdated=false;
		for(int i=0;i<textileBrands.length;i++)
		{
			if(textileBrands[i]==oldBrand)
			{
				textileBrands[i]=newBrand;
				isTextileUpdated=true;
			}
		}
		if(isTextileUpdated==false)
		{
			System.out.println("sorry new brand is not updated");
		}
	return isTextileUpdated;	
	}

}