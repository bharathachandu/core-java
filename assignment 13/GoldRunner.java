class GoldRunner{

public static void main(String goldItem[])
{
	System.out.println("The Shop Name is:"+Gold.name);
	System.out.println("The Shop Owner Name is:"+Gold.ownerName);
	
	boolean isGoldAdded = Gold.addGoldItem("Gold Chain");
	System.out.println("Is Gold Item Added:"+isGoldAdded);
	
	
	isGoldAdded = Gold.addGoldItem("Gold Ring");
	System.out.println("Is Gold Item Added:"+isGoldAdded);
	
	
    isGoldAdded = Gold.addGoldItem("Gold Bracelet");
	System.out.println("Is Gold Item Added:"+isGoldAdded);
	
	isGoldAdded = Gold.addGoldItem("Gold Watch");
	System.out.println("Is Gold Item Added:"+isGoldAdded);
	
	isGoldAdded = Gold.addGoldItem("Gold Cufflink");
	System.out.println("Is Gold Item Added:"+isGoldAdded);
	
	isGoldAdded = Gold.addGoldItem("Gold Necklaces");
	System.out.println("Is Gold Item Added:"+isGoldAdded);
	
	isGoldAdded = Gold.addGoldItem("Gold Earring");
	System.out.println("Is Gold Item Added:"+isGoldAdded);
	
	Gold.getAllGoldItems();
	
	boolean isGoldAdd = Gold.updateGoldItem("Gold Necklaces","Gold Tie Bar");
	System.out.println("Is Gold Item Added updated:"+isGoldAdd);
	
	Gold.getAllGoldItems();

	}


}