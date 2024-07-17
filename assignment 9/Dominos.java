class Dominos {
	static double price;
    public static double takeOrder(String foodItems){
        if(foodItems == "Margherita Pizza"){
            price=299.00;
			return price;
        }
		if(foodItems == "Sprite"){
            price=60.00;
			return price;
        }
        if(foodItems == "Pepperoni Pizza"){
            price=309.00;
			return price;
        }
		if(foodItems == "Fanta"){
            price=80.00;
			return price;
        }
        if(foodItems == "Cheese Burst Pizza"){
            price=269.00;
			return price;
        }
		if(foodItems == "Coca Cola"){
            price=50.00;
			return price;
        }
        if(foodItems == "Farmhouse Pizza"){
            price=289.00;
			return price;
        }
		if(foodItems == "Choco Lava Cake"){
            return 159.00;
        }
        if(foodItems == "Veggie Paradise Pizza"){
            return 269.00;
        }
		if(foodItems == "Potato Wedges"){
            return 89.00;
        }
        if(foodItems == "Paneer Makhani Pizza"){
            return 249.00;
        }
		if(foodItems == "Cheesy Garlic Bread"){
            return 179.00;
        }
        if(foodItems == "Chicken Supreme Pizza"){
            return 359.00;
        }
		if(foodItems == "Garlic Breadsticks"){
            return 179.00;
        }
        if(foodItems == "Peppy Paneer Pizza"){
            return 279.00;
        }
        if(foodItems == "Extravaganzza Pizza"){
            return 369.00;
        }
 
        else{
            System.out.println(foodItems + " not found");
        }
	return 0.0;	
	}
public static double takeOrder(String foodItems,int quantity)	
{ double price=takeOrder(foodItems);
	if(quantity>1)
	{
		price=price*quantity;
		System.out.println("The price for "+foodItems+" of "+quantity+" Quantity is "+price);
	}
	return price;
}
}
