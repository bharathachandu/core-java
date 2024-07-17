class BarShop
{
	public static void main(String shop[])
	{
		System.out.println("The Wine Shop Name is:"+Bar.name);
		System.out.println("The Wine Shop Owner Name is:"+Bar.ownerName);
		
		boolean isBrandAdded = Bar.addWineBrands("Chateau Lafite Rothschild");
		System.out.println("IS Wine Brand Added:"+isBrandAdded);
		
		isBrandAdded = Bar.addWineBrands("Domaine de la Romanée-Conti");
		System.out.println("IS Wine Brand Added:"+isBrandAdded);
		
		isBrandAdded = Bar.addWineBrands("Opus One");
		System.out.println("IS Wine Brand Added:"+isBrandAdded);
		
		isBrandAdded = Bar.addWineBrands("Penfolds");
		System.out.println("IS Wine Brand Added:"+isBrandAdded);
		
		isBrandAdded = Bar.addWineBrands("Antinori");
		System.out.println("IS Wine Brand Added:"+isBrandAdded);
		
		isBrandAdded = Bar.addWineBrands("Cloudy Bay");
		System.out.println("IS Wine Brand Added:"+isBrandAdded);
		
		isBrandAdded = Bar.addWineBrands("Robert Mondavi");
		System.out.println("IS Wine Brand Added:"+isBrandAdded);
		
		isBrandAdded = Bar.addWineBrands("Mouton Rothschild");
		System.out.println("IS Wine Brand Added:"+isBrandAdded);
		
		isBrandAdded = Bar.addWineBrands("Catena Zapata");
		System.out.println("IS Wine Brand Added:"+isBrandAdded);
		
		isBrandAdded = Bar.addWineBrands("Torres");
		System.out.println("IS Wine Brand Added:"+isBrandAdded);
		
		isBrandAdded = Bar.addWineBrands("Veuve Clicquot");
		System.out.println("IS Wine Brand Added:"+isBrandAdded);
		
		isBrandAdded = Bar.addWineBrands("Concha y Toro");
		System.out.println("IS Wine Brand Added:"+isBrandAdded);
		
		isBrandAdded = Bar.addWineBrands("Gaja");
		System.out.println("IS Wine Brand Added:"+isBrandAdded);
		
		isBrandAdded = Bar.addWineBrands("Peninsula Ridge Estates Winery");
		System.out.println("IS Wine Brand Added:"+isBrandAdded);
		
		isBrandAdded = Bar.addWineBrands("Errazuriz");
		System.out.println("IS Wine Brand Added:"+isBrandAdded);
		
		Bar.getAllBrands();
		
		boolean isBrandUpdated = Bar.updateWineBrand("Concha y Toro","Louis Roederer");
		System.out.println("Is Wine Brand Updated:"+isBrandUpdated); 
		
		Bar.getAllBrands();
	}


}