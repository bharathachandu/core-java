class ShoeShop
{
	public static void main(String shop[])
	{
		System.out.println("The Shoe Shop Name is:"+Shoe.name);
		System.out.println("The Shoe Shop Owner Name is:"+Shoe.ownerName);
		
		boolean isShoeAdded = Shoe.addShoeBrands("Allen Edmonds");
		System.out.println("IS Wine Brand Added:"+isShoeAdded);
		
		isShoeAdded = Shoe.addShoeBrands("Church's");
		System.out.println("IS Wine Brand Added:"+isShoeAdded);
		
		isShoeAdded = Shoe.addShoeBrands("Edward Green");
		System.out.println("IS Wine Brand Added:"+isShoeAdded);
		
		isShoeAdded = Shoe.addShoeBrands("John Lobb");
		System.out.println("IS Wine Brand Added:"+isShoeAdded);
		
		isShoeAdded = Shoe.addShoeBrands("Alden");
		System.out.println("IS Wine Brand Added:"+isShoeAdded);
		
		isShoeAdded = Shoe.addShoeBrands("Crockett & Jones");
		System.out.println("IS Wine Brand Added:"+isShoeAdded);
		
		isShoeAdded = Shoe.addShoeBrands("Barker");
		System.out.println("IS Wine Brand Added:"+isShoeAdded);
		
		isShoeAdded = Shoe.addShoeBrands("Grenson");
		System.out.println("IS Wine Brand Added:"+isShoeAdded);
		
		isShoeAdded = Shoe.addShoeBrands("Loake");
		System.out.println("IS Wine Brand Added:"+isShoeAdded);
		
		isShoeAdded = Shoe.addShoeBrands("Tricker's");
		System.out.println("IS Wine Brand Added:"+isShoeAdded);
		
		isShoeAdded = Shoe.addShoeBrands("Santoni");
		System.out.println("IS Wine Brand Added:"+isShoeAdded);
		
		isShoeAdded = Shoe.addShoeBrands("Berluti");
		System.out.println("IS Wine Brand Added:"+isShoeAdded);
		
		isShoeAdded = Shoe.addShoeBrands("Meermin");
		System.out.println("IS Wine Brand Added:"+isShoeAdded);
		
		isShoeAdded = Shoe.addShoeBrands("Magnanni");
		System.out.println("IS Wine Brand Added:"+isShoeAdded);
		
		isShoeAdded = Shoe.addShoeBrands("Brunello Cucinelli");
		System.out.println("IS Wine Brand Added:"+isShoeAdded);
		
		Shoe.getAllShoeBrands();
		
		boolean isShoeBrandUpdated = Shoe.updateShoeBrand("Berluti","Ferragamo");
		System.out.println("Is Wine Brand Updated:"+isShoeBrandUpdated); 
		
		Shoe.getAllShoeBrands();
	}


}