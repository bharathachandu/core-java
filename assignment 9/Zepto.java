class Zepto{

    public static double takeOrder(String foodItems){
        
		
		if (foodItems == "Kurkure"){
            return 20.00;
         }
          if (foodItems == "Apple Juice"){
            return 50.00;
        }
        if (foodItems == "Cheese Slices"){
            return 30.00;
        }
        if (foodItems == "Chocolate Box"){
            return 100.00;
        }
        if (foodItems == "Amul Butter"){
            return 60.00;
        }
        if (foodItems == "Banana"){
            return 10.00;
        }
        if (foodItems == "Milk"){
            return 25.00;
        }
        if (foodItems == "Bread"){
            return 30.00;
        }
        if (foodItems == "Eggs"){
            return 40.00;
        }
        if (foodItems == "Peanut Butter"){
            return 70.00;
        }
        if (foodItems == "Yogurt"){
            return 15.00;
        }
        if (foodItems == "Instant Noodles"){
            return 40.00;
        }
        if (foodItems == "Cereal"){
            return 55.00;
        }
        if (foodItems == "Ice Cream"){
            return 80.00;
        }
        if (foodItems == "Chips"){
            return 25.00;
        }
        else {
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
