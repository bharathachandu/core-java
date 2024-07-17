class Swiggy{
static double price;
	public static double takeOrder(String foodItems){
	if(foodItems == "Pizza"){
		price=199.0;
		return price;
	}
	if(foodItems == "Burger"){
		price=99.0;
		return price;
	}
	if(foodItems == "FrenchFries"){
		price=109.0;
		return price;
	}
	if(foodItems == "OreoMilkShake"){
		price=119.0;
		return price;
	}
	if(foodItems == "Biriyani"){
		price=299.0;
		return price;
	}
	if(foodItems == "Momos"){
		price=109.0;
		return price;
	}
	if(foodItems == "Panner65"){
		price=199.0;
		return price;
	}
	if(foodItems == "mushroom65"){
		price=219.0;
		return price;
	}
	if(foodItems == "pannerpeperdry"){
		price=259.0;
		return price;
	}
	if(foodItems == "MasalaDosa"){
		price=109.0;
		return price;
	}
	if(foodItems == "idliVada"){
		price=79.0;
		return price;
	}
	if(foodItems == "ChikenRoll"){
		price=169.0;
		return price;
	}
	if(foodItems == "moBurger"){
		price=159.0;
		return price;
	}
	if(foodItems == "MasalaCoke"){
		price=40.0;
		return price;
	}
	if(foodItems == "KFCWings"){
		price=249.0;
		return price;
	}
	if(foodItems == "IceCream"){
		price=179.0;
		return price;
	}
	else{
	System.out.println(foodItems +"Not Found");
	
	}
	return 0.0;
	
}

//method overloading - can be done with same name with different number of parameters

public static double takeOrder(String foodItems,int quantity ){
	if(foodItems == "Pizza"){
		price = 199.00 * quantity;
		return price;
	}
	if(foodItems == "Burger"){
		price = 99.00 * quantity;
		return price;
	}
	if(foodItems == "FrenchFries"){
		price = 69.00 * quantity;
		return price;
	}
	if(foodItems == "OreoMilkShake"){
		price = 119.00 * quantity;
		return price;
	}
	if(foodItems == "Biriyani"){
		price = 299.00 * quantity;
		return price;
	}
	if(foodItems == "Momos"){
		price = 109.00 * quantity;
		return price;
	}
	if(foodItems == "Panner65"){
		price = 199.00 * quantity;
		return price;
	}
	if(foodItems == "mushroom65"){
		price = 219.00 * quantity;
		return price;
	}
	if(foodItems == "pannerpeperdry"){
		price = 259.00 * quantity;
		return price;
	}
	if(foodItems == "MasalaDosa"){
		price = 109.00 * quantity;
		return price;
	}
	if(foodItems == "idliVada"){
		price = 79.00 * quantity;
		return price;
	}
	if(foodItems == "ChikenRoll"){
		price = 169.00 * quantity;
		return price;
	}
	if(foodItems == "moBurger"){
		price = 159.00 * quantity;
		return price;
	}
	if(foodItems == "MasalaCoke"){
		price = 40.00 * quantity;
		return price;
	}
	if(foodItems == "KFCWings"){
		price = 190.00 * quantity;
		return price;
	}
	if(foodItems == "IceCream"){
		price = 179.00 * quantity;
		return price;
	}
	else{
	System.out.println(foodItems +"Not Found");
	
	}
	return 0.0;
}
}