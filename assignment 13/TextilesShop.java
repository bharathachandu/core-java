class TextilesShop
{
	public static void main(String shop[])
	{
		System.out.println("The Textile Shop Name is:"+Textiles.name);
		System.out.println("The Textile Shop Owner Name is:"+Textiles.ownerName);
		
		boolean isTextilesAdded = Textiles.addMaterial("LVMH");
		System.out.println("IS Textiles Brand Added:"+isTextilesAdded);
		
		isTextilesAdded = Textiles.addMaterial("Kering");
		System.out.println("IS Textiles Brand Added:"+isTextilesAdded);
		
		isTextilesAdded = Textiles.addMaterial("H&M");
		System.out.println("IS Textiles Brand Added:"+isTextilesAdded);
		
		isTextilesAdded = Textiles.addMaterial("Zara");
		System.out.println("IS Textiles Brand Added:"+isTextilesAdded);
		
		isTextilesAdded = Textiles.addMaterial("Nike");
		System.out.println("IS Textiles Brand Added:"+isTextilesAdded);
		
		isTextilesAdded = Textiles.addMaterial("Adidas");
		System.out.println("IS Textiles Brand Added:"+isTextilesAdded);
		
		isTextilesAdded = Textiles.addMaterial("Uniqlo");
		System.out.println("IS Textiles Brand Added:"+isTextilesAdded);
		
		isTextilesAdded = Textiles.addMaterial("Gap Inc");
		System.out.println("IS Textiles Brand Added:"+isTextilesAdded);
		
		isTextilesAdded = Textiles.addMaterial("Levi Strauss & Co");
		System.out.println("IS Textiles Brand Added:"+isTextilesAdded);
		
		isTextilesAdded = Textiles.addMaterial("Ralph Lauren Corporation");
		System.out.println("IS Textiles Brand Added:"+isTextilesAdded);
		
		isTextilesAdded = Textiles.addMaterial("Under Armour");
		System.out.println("IS Textiles Brand Added:"+isTextilesAdded);
		
		isTextilesAdded = Textiles.addMaterial("PVH Corp");
		System.out.println("IS Textiles Brand Added:"+isTextilesAdded);
		
		isTextilesAdded = Textiles.addMaterial("Fast Retailing");
		System.out.println("IS Textiles Brand Added:"+isTextilesAdded);
		
		isTextilesAdded = Textiles.addMaterial("Lululemon Athletica");
		System.out.println("IS Textiles Brand Added:"+isTextilesAdded);
		
		isTextilesAdded = Textiles.addMaterial("Burberry Group");
		System.out.println("IS Textiles Brand Added:"+isTextilesAdded);
		
		Textiles.getAllMaterialInfo();
		
		boolean isTextilesBrandUpdated = Textiles.updateMaterial("PVH Corp","The North Face");
		System.out.println("Is Textiles Brand Updated:"+isTextilesBrandUpdated); 
		
		Textiles.getAllMaterialInfo();
	}


}