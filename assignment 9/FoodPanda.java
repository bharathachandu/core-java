class FoodPanda{
    public static double takeOrder(String foodItems){
        if (foodItems == "Butter Chicken"){
            return 249.00;
        }
        if (foodItems == "Tikka Masala"){
            return 229.00;
        }
        if (foodItems == "Caesar Salad"){
            return 129.00;
        }
        if (foodItems == "Greek Salad"){
            return 139.00;
        }
        if (foodItems == "Beef Tacos"){
            return 159.00;
        }
        if (foodItems == "Chicken Tacos"){
            return 149.00;
        }
        if (foodItems == "Fish Tacos"){
            return 169.00;
        }
        if (foodItems == "Ice Cream"){
            return 99.00;
        }
        if (foodItems == "Sashimi"){
            return 179.00;
        }
        if (foodItems == "California Roll"){
            return 189.00;
        }
        if (foodItems == "Chicken"){
            return 159.00;
        }
        if (foodItems == "Beef"){
            return 169.00;
        }
        if (foodItems == "Sandwich"){
            return 129.00;
        }
        if (foodItems == "Cake"){
            return 79.00;
        }
        if (foodItems == "Pastry"){
            return 59.00;
        }
        if (foodItems == "Cookie"){
            return 49.00;
        }
        else {
            System.out.println(foodItems + "sorry your order not found");
           
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
