class BlinkItRunner {
    
    public static void main(String[] args) {
        boolean isItemAdded= BlinkIt.addItemName("MilkShake");
        System.out.println("The Item Added Is = " + isItemAdded);
        BlinkIt.addItemName("Shampoo");
        System.out.println("The Item Added Is = " + isItemAdded);
        BlinkIt.addItemName("Coke");
        System.out.println("The Item Added Is = " + isItemAdded);
        BlinkIt.addItemName("Chacolate");
        System.out.println("The Item Added Is = " + isItemAdded);
        BlinkIt.addItemName("Pen");
        System.out.println("The Item Added Is = " + isItemAdded);
        BlinkIt.addItemName("Bat");
        System.out.println("The Item Added Is = " + isItemAdded);
        BlinkIt.addItemName("Bowl");
        System.out.println("The Item Added Is = " + isItemAdded);
        BlinkIt.addItemName("Soap");
        System.out.println("The Item Added Is = " + isItemAdded);
        BlinkIt.addItemName("Belt");
        System.out.println("The Item Added Is = " + isItemAdded);
        BlinkIt.addItemName("Cap");
        BlinkIt.getItemNames();
		System.out.println();
        
		
        boolean isItemUpdated = BlinkIt.updateItemName("Belt", "Battery");
        System.out.println("The Updated Item Is = " + isItemUpdated);
        BlinkIt.getItemNames();
		System.out.println();
        
		boolean isItemdeleted = BlinkIt.deleteItemNames("Cap");
        System.out.println("The deleted Item is " + isItemdeleted);
        BlinkIt.getItemNames();
    }
}
