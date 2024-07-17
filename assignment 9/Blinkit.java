class Blinkit {
static double price;	
public static double takeOrder(String item){
if(item == "Household Essentials"){
price=188.00;
return price;
}
if(item == "Groceries"){
price=288.00;
return price;
}
if(item == "Electronics"){
price=268.00;
return price;
}
if(item == "Dairy Products"){
price=198.00;
return price;
}
if(item == "Fresh Vegetables"){
price=88.00;
return price;
}
if(item == "Stationery"){
price=48.00;
return price;
}
if(item == "Fruits"){
price=118.00;
return price;
}
if(item == "Health and Wellness"){
price=168.00;
return price;
}
if(item == "Meat"){
price=288.00;
return price;
}
if(item == "Pet Supplies"){
return 178.00;
}
if(item == "Bakery"){
price=118.00;
return price;
}
if(item == "Baby Care"){
price=78.00;
return price;
}
if(item == "Beverages"){
price=198.00;
return price;
}
if(item == "Snacks"){
price=228.00;
return price;
}
if(item == "Personal Care"){
price=258.00;
return price;
}
if(item == "Home Care"){
price=158.00;
return price;
} 
else{
System.out.println(item + "oops! your food order is not available please try again some time");
}
return 0.0;	
}
public static double takeOrder(String item,int quantity)	
{
	if(quantity>1)
	{
		price=price*quantity;
		System.out.println("The price for "+item+" of "+quantity+" Quantity is "+price);
	}
	return price;
}	
	
}
