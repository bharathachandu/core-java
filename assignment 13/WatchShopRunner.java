class WatchShopRunner
{
	public static void main(String watch[])
	{
	
		System.out.println("The Watch Shop Name is:"+WatchShop.name);
		System.out.println("The Watch Shop Owner Name is:"+WatchShop.ownerName);
		
		boolean isWatchAdded = WatchShop.addWatchBrandNames("Rolex");
		System.out.println("Is Watch Brand Added:"+isWatchAdded);
		
		isWatchAdded = WatchShop.addWatchBrandNames("Omega");
		System.out.println("Is Watch Brand Added:"+isWatchAdded);

		isWatchAdded = WatchShop.addWatchBrandNames("TAG Heuer");
		System.out.println("Is Watch Brand Added:"+isWatchAdded);
		
		isWatchAdded = WatchShop.addWatchBrandNames("Breitling");
		System.out.println("Is Watch Brand Added:"+isWatchAdded);
		
		isWatchAdded = WatchShop.addWatchBrandNames("Patek Philippe");
		System.out.println("Is Watch Brand Added:"+isWatchAdded);
		
		isWatchAdded = WatchShop.addWatchBrandNames("Audemars Piguet");
		System.out.println("Is Watch Brand Added:"+isWatchAdded);
		
		isWatchAdded = WatchShop.addWatchBrandNames("IWC Schaffhausen");
		System.out.println("Is Watch Brand Added:"+isWatchAdded);
		
		isWatchAdded = WatchShop.addWatchBrandNames("Panerai");
		System.out.println("Is Watch Brand Added:"+isWatchAdded);
		
		isWatchAdded = WatchShop.addWatchBrandNames("Hublot");
		System.out.println("Is Watch Brand Added:"+isWatchAdded);
		
		isWatchAdded = WatchShop.addWatchBrandNames("Jaeger-LeCoultre");
		System.out.println("Is Watch Brand Added:"+isWatchAdded);
		
		WatchShop.getAllWatchBrands();
		
		boolean isWatchUpdated = WatchShop.updateWatchBrands("Omega","Tissot");
		System.out.println("Is Watch Brand Updated:"+isWatchUpdated);
		
		WatchShop.getAllWatchBrands();
	}	
}