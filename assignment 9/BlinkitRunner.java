class BlinkitRunner{
public static void main(String items[]){
System.out.println("place your order Please");
double item1 = Blinkit.takeOrder("Household Essentials");
System.out.println("Household Essentials: " + item1);
double item2 = Blinkit.takeOrder("Groceries");
System.out.println("Groceries: " + item2);
double item3 = Blinkit.takeOrder("Electronics");
System.out.println("Electronics: " + item3);
double item4 = Blinkit.takeOrder("Dairy Products");
System.out.println("Dairy Products: " + item4);
double item5 = Blinkit.takeOrder("Stationery");
System.out.println("Stationery: " + item5);
double item6 = Blinkit.takeOrder("Health");
System.out.println("Health and Wellness: " + item6); 
double item7 = Blinkit.takeOrder("Fresh Vegetables");
System.out.println("Fresh Vegetables: " + item7);
double item8 = Blinkit.takeOrder("Fruits");
System.out.println("Fruits: " + item8);
double item9 = Blinkit.takeOrder("Pet Supplies");
System.out.println("Pet Supplies: " + item9); 
double item10 = Blinkit.takeOrder("Meat");
System.out.println("Meat: " + item10);
double item11 = Blinkit.takeOrder("Baby Care");
System.out.println("Baby Care: " + item11);
double item12 = Blinkit.takeOrder("Bakery");
System.out.println("Bakery: " + item12);
double item13 = Blinkit.takeOrder("Personal Care");
System.out.println("Personal Care: " + item13);
double item14 = Blinkit.takeOrder("Beverages");
System.out.println("Beverages: " + item14);
double item15 = Blinkit.takeOrder("Snacks");
System.out.println("Snacks: " + item15);
double item16 = Blinkit.takeOrder("Home Care");
System.out.println("Home Care: " + item16);   
System.out.println("---End of list---");
double item17 = Blinkit.takeOrder("Groceries",2);
	}
}
