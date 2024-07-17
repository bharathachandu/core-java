class Ikea{
	static String automotives[] = {"Tires", "Engine oil", "Brake pads", "Car batteries", "Windshield wipers", "Car polish"};
	static String sports[] = {"Basketball", "Football", "Running shoes", "Tennis racket", "Golf clubs", "Swimming goggles"};
	static String shoes[] = {"puma ","nike","addidas","sparks","bata","woodland"};
	static String electronics[] ={"Smartphone", "Laptop", "Smartwatch", "Headphones", "TV", "Tablet"} ;
	static String clothings[] = {"T-shirt", "Jeans", "Hoodie", "Dress", "Sneakers", "Jacket"};
	static String books[] = {"1984 by George Orwell", "To Kill a Mockingbird by Harper Lee", "The Great Gatsby by F. Scott Fitzgerald", "Pride and Prejudice by Jane Austen", "The Catcher in the Rye by J.D. Salinger", "The Lord of the Rings by J.R.R. Tolkien"};
    static String healthWellness[] = {"Multivitamins", "Protein powder", "Omega-3 supplements", "Yoga mat", "Fitness tracker", "Essential oils"};
	static String furnitureDecors[] = {"Sofa", "Coffee table", "Bed frame", "Dining chairs", "Rug", "Wall art"};
	static String petSupplies[] = {"Pet Food", "Pet Beds", "Toys for Pets", "Collars and Leashes", "Grooming Supplies", "Pet Health Care"};
	static String groceries[] = {"Fresh Produce", "Dairy Products", "Meat and Seafood", "Pantry Staples", "Beverages", "Snacks"};
	static String gardens[] = {"Outdoor Furniture", "Garden Tools", "Planters and Pots", "Outdoor Lighting", "Grills and Outdoor Cooking", "Garden Decor"};
	static String toolsHardwares[] = {"Power Tools", "Hand Tools", "Tool Storage", "Fasteners and Hardware", "Plumbing Supplies", "Electrical Supplies"};
	static String beverages[] = {"Soft Drinks", "Juices", "Tea", "Coffee", "Energy Drinks", "Bottled Water"};
	static String frozenFoods[] = {"Frozen Vegetables", "Ice Cream", "Frozen Pizzas", "Frozen Desserts", "Frozen Meals", "Frozen Snacks"};
	static String luggages[] = {"Suitcases", "Travel Backpacks", "Duffel Bags", "Briefcases", "Travel Accessories", "Luggage Sets"};
    static String crockerys[] = {"Plates", "Bowls", "Cups and Saucers", "Mugs", "Serving Dishes", "Teapots"};
	static String homeDecors[] = {"Wall Art", "Decorative Pillows", "Vases", "Clocks", "Mirrors", "Curtains"};
	static String personalHomeHygienes[] = {"Hand Soap", "Disinfectant Wipes", "Air Fresheners", "Tissue Paper", "Laundry Detergent", "Cleaning Supplies"};
	static String perfumes[] = {"Eau de Parfum", "Eau de Toilette", "Cologne", "Perfume Sets", "Roll-on Perfumes", "Perfume Oils"};
	static String handwashes[] = {"Liquid Hand Soap", "Foaming Hand Soap", "Antibacterial Hand Wash", "Gel Hand Wash", "Hand Wash Refills", "Sensitive Skin Hand Wash"};

		
		public static void main(String[] brands){
			/*System.out.println("The Available products in Modern Market are:");
			System.out.println();
			System.out.println("The Automotive Products are \n " +"1."+ automotive[0] + "\n " +"2."+ automotive[1] + "\n " +"3."+ automotive[2] + "\n "+"4."+ automotive[3] + "\n " +"5."+ automotive[4] + "\n " +"6."+ automotive[5]);
			System.out.println();
			System.out.println("The Sports and Fitness Products are \n " +"1."+ sports[0] + "\n " +"2."+ sports[1] + "\n " +"3."+ sports[2] + "\n "+"4."+ sports[3] + "\n " +"5."+ sports[4] + "\n " +"6."+ sports[5]);
			System.out.println();
			System.out.println("The shoe Products are \n "+"1."+shoe[0]+"\n "+"2."+shoe[1]+"\n "+"3."+shoe[2]+"\n "+"4."+shoe[3]+"\n "+"5."+shoe[4]+"\n "+"6."+shoe[5]);
			System.out.println();
			System.out.println("The electronic gadgets are \n "+"1."+electronics[0]+"\n "+"2."+electronics[1]+"\n "+"3."+electronics[2]+"\n "+"4."+electronics[3]+"\n "+"5."+electronics[4]+"\n "+"6."+electronics[5]);
			System.out.println();
			System.out.println("The clothing Products are \n " +"1."+ clothing[0] + "\n " +"2."+ clothing[1] + "\n " +"3."+ clothing[2] + "\n "+"4."+ clothing[3] + "\n " +"5."+ clothing[4] + "\n " +"6."+ clothing[5]);
			System.out.println();		
			System.out.println("The Books and Stationery items are \n " + "1."+books[0] + "\n " +"2."+ books[1] + "\n " +"3."+ books[2] + "\n "+"4."+ books[3] + "\n " +"5."+ books[4] + "\n " +"6."+ books[5]);
			System.out.println();
			System.out.println("The Health and Wellness Products are\n " +"1."+ healthWellness[0] + "\n " +"2."+ healthWellness[1] + "\n " +"3."+ healthWellness[2] + "\n "+"4."+ healthWellness[3] + "\n " +"5."+ healthWellness[4] + "\n " +"6."+ healthWellness[5]);
			System.out.println();
			System.out.println("The Furniture and Decor Products are \n " +"1."+ furnitureDecor[0] + "\n " +"2."+ furnitureDecor[1] + "\n " +"3."+ furnitureDecor[2] + "\n " +"4."+ furnitureDecor[3] + "\n " +"5."+ furnitureDecor[4] + "\n " +"6."+ furnitureDecor[5]);
			System.out.println();
			System.out.println("The Pet Supplies Products are \n " +"1."+ petSupplies[0] + "\n " +"2."+ petSupplies[1] + "\n " +"3."+ petSupplies[2] + "\n "+"4."+ petSupplies[3] + "\n " +"5."+ petSupplies[4] + "\n " +"6."+ petSupplies[5]);
			System.out.println();
			System.out.println("The Groceries are \n " +"1."+ groceries[0] + "\n " +"2."+ groceries[1] + "\n " +"3."+ groceries[2] + "\n "+"4."+ groceries[3] + "\n " +"5."+ groceries[4] + "\n " +"6."+ groceries[5]);
			System.out.println();
			System.out.println("The Garden items are \n " +"1."+ garden[0] + "\n " + "2."+garden[1] + "\n " +"3."+ garden[2] + "\n "+"4."+ garden[3] + "\n " +"5."+ garden[4] + "\n " +"6."+ garden[5]);
			System.out.println();
			System.out.println("The Tools and Hardware items are \n" +"1."+ toolsHardware[0] + "\n " +"2."+ toolsHardware[1] + "\n " +"3."+ toolsHardware[2] + "\n "+"4."+ toolsHardware[3] + "\n " +"5."+ toolsHardware[4] + "\n " +"6."+ toolsHardware[5]);
			System.out.println();
			System.out.println("The Beverages are \n " +"1."+ beverages[0] + "\n " +"2."+ beverages[1] + "\n " +"3."+ beverages[2] + "\n "+"4."+ beverages[3] + "\n " +"5."+ beverages[4] + "\n " +"6."+ beverages[5]);
			System.out.println();
			System.out.println("The Frozen Foods Products are \n " +"1."+ frozenFoods[0] + "\n " +"2."+ frozenFoods[1] + "\n " +"3."+ frozenFoods[2] + "\n "+ "4."+frozenFoods[3] + "\n " +"5."+ frozenFoods[4] + "\n " +"6."+ frozenFoods[5]);
			System.out.println();
			System.out.println("The Luggage Products are \n " +"1."+ luggage[0] + "\n " +"2."+ luggage[1] + "\n " +"3."+ luggage[2] + "\n "	+"4."+ luggage[3] + "\n " +"5."+ luggage[4] + "\n " +"6."+ luggage[5]);
			System.out.println();
			System.out.println("The Crockery are \n " +"1."+ crockery[0] + "\n " +"2."+ crockery[1] + "\n " + "3."+crockery[2] + "\n "+"4."+ crockery[3] + "\n " +"5."+ crockery[4] + "\n " +"6."+ crockery[5]);
			System.out.println();
			System.out.println("The Home Decor's are \n " +"1."+ homeDecor[0] + "\n " +"2."+ homeDecor[1] + "\n " + "3."+homeDecor[2] + "\n "+"4."+ homeDecor[3] + "\n " +"5."+ homeDecor[4] + "\n " +"6."+ homeDecor[5]);
			System.out.println();
			System.out.println("The Personal and Home Hygiene Products are \n " +"1."+ personalHomeHygiene[0] + "\n " + "2."+personalHomeHygiene[1] + "\n " + "3."+personalHomeHygiene[2] + "\n "+"4."+ personalHomeHygiene[3] + "\n " +"5."+ personalHomeHygiene[4] + "\n " +"6."+ personalHomeHygiene[5]);
			System.out.println();	
			System.out.println("The Perfumes are \n " +"1."+ perfumes[0] + "\n " +"2."+ perfumes[1] + "\n " +"3."+ perfumes[2] + "\n "+"4."+ perfumes[3] + "\n " +"5."+ perfumes[4] + "\n " +"6."+ perfumes[5]);
			System.out.println();	
			System.out.println("The Handwash's are \n " +"1."+ handwash[0] + "\n " +"2."+ handwash[1] + "\n " +"3."+ handwash[2] + "\n "+"4."+ handwash[3] + "\n " +"5."+ handwash[4] + "\n " +"6."+ handwash[5]);
			*/
			System.out.println("The Available products in Modern Market are:");
			System.out.println("The Automotive Products are:");
			for(int a=0;a<6;a++)
			{
				System.out.println(automotives[a]);
			}
			System.out.println();
			System.out.println("The Sports and Fitness Products are");
			for(int b=0;b<6;b++)
			{
				System.out.println(sports[b]);
			}
			System.out.println();
			System.out.println("The shoe Products are:");
			for(int c=0;c<6;c++)
			{
				System.out.println(shoes[c]);
			}
			System.out.println();
			System.out.println("The electronic gadgets are:");
			for(int d=0;d<6;d++)
			{
				System.out.println(electronics[d]);
			}
			System.out.println();
			System.out.println("The clothing Products are:");
			for(int e=0;e<6;e++)
			{
				System.out.println(clothings[e]);
			}
			System.out.println();
			System.out.println("The Books and Stationery items are:");
			for(int f=0;f<6;f++)
			{
				System.out.println(books[f]);
			}
			System.out.println();
			System.out.println("The Health and Wellness Products are:");
			for(int g=0;g<6;g++)
			{
				System.out.println(healthWellness[g]);
			}
			System.out.println();
			System.out.println("The Furniture and Decor Products are:");
			for(int h=0;h<6;h++)
			{
				System.out.println(furnitureDecors[h]);
			}
			System.out.println();
			System.out.println("The Pet Supplies Products are:");
			for(int i=0;i<6;i++)
			{
				System.out.println(petSupplies[i]);
			}
			System.out.println();
			System.out.println("The Groceries are:");
			for(int j=0;j<6;j++)
			{
				System.out.println(groceries[j]);
			}
			System.out.println();
			System.out.println("The Garden items are:");
			for(int k=0;k<6;k++)
			{
				System.out.println(gardens[k]);
			}
			System.out.println();
			System.out.println("The Tools and Hardware items are:");
			for(int l=0;l<6;l++)
			{
				System.out.println(toolsHardwares[l]);
			}
			System.out.println();
			System.out.println("The Beverages are:");
			for(int m=0;m<6;m++)
			{
				System.out.println(beverages[m]);
			}
			System.out.println();
			System.out.println("The Frozen Foods Products are:");
			for(int n=0;n<6;n++)
			{
				System.out.println(frozenFoods[n]);
			}
			System.out.println();
			System.out.println("The Luggage Products are:");
			for(int o=0;o<6;o++)
			{
				System.out.println(luggages[o]);
			}
			System.out.println();
			System.out.println("The Crockery are:");
			for(int p=0;p<6;p++)
			{
				System.out.println(crockerys[p]);
			}
			System.out.println();
			System.out.println("The Home Decor's are:");
			for(int q=0;q<6;q++)
			{
				System.out.println(homeDecors[q]);
			}
			System.out.println();
			System.out.println("The Personal and Home Hygiene Products are:");
			for(int r=0;r<6;r++)
			{
				System.out.println(personalHomeHygienes[r]);
			}
			System.out.println();
			System.out.println("The Perfumes are:");
			for(int s=0;s<6;s++)
			{
				System.out.println(perfumes[s]);
			}
			System.out.println();
			System.out.println("The Handwash's are:");
			for(int t=0;t<6;t++)
			{
				System.out.println(handwashes[t]);
			}
			
		}
}
