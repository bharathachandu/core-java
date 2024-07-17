class DominosRunner {
    public static void main(String orders[]){
        System.out.println("place your order please");
        double item1 = Dominos.takeOrder("Margherita Pizza");
        System.out.println("Margherita Pizza: " + item1);
		double item2 = Dominos.takeOrder("Sprite");
        System.out.println("Sprite: " + item2);
        double item3 = Dominos.takeOrder("Pepperoni Pizza");
        System.out.println("Pepperoni Pizza: " + item3);
        double item4 = Dominos.takeOrder("Fanta");
        System.out.println("Fanta: " + item4);
		double item5 = Dominos.takeOrder("Cheese Burst Pizza");
        System.out.println("Cheese Burst Pizza: " + item5);
        double item6 = Dominos.takeOrder("Coca Cola");
        System.out.println("Coca Cola: " + item6);
		double item7 = Dominos.takeOrder("Farmhouse Pizza");
        System.out.println("Farmhouse Pizza: " + item7);
        double item8 = Dominos.takeOrder("Choco Lava Cake");
        System.out.println("Choco Lava Cake: " + item8);
		double item9 = Dominos.takeOrder("Veggie Paradise Pizza");
        System.out.println("Veggie Paradise Pizza: " + item9);
        double item10 = Dominos.takeOrder("Potato Wedges");
        System.out.println("Potato Wedges: " + item10);
		double item11 = Dominos.takeOrder("Paneer Makhani Pizza");
        System.out.println("Paneer Makhani Pizza: " + item11);
        double item12 = Dominos.takeOrder("Cheesy Garlic Bread");
        System.out.println("Cheesy Garlic Bread: " + item12);
		double item13 = Dominos.takeOrder("Chicken Supreme Pizza");
        System.out.println("Chicken Supreme Pizza: " + item13);
        double item14 = Dominos.takeOrder("Garlic Breadsticks");
        System.out.println("Garlic Breadsticks: " + item14);
		double item15 = Dominos.takeOrder("Peppy Paneer Pizza");
        System.out.println("Peppy Paneer Pizza: " + item15);
		double item16 = Dominos.takeOrder("Extravaganzza Pizza");
        System.out.println("Extravaganzza Pizza: " + item16);  
        System.out.println("Thats the end of menu thank you");	
		double item17 = Dominos.takeOrder("Peppy Paneer Pizza",3);
	}
}
