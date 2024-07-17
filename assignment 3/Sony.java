class Sony{

	static String prodName = "Sony WH-1000XM4";
    static String prodBrand = "Sony";
    static String features = "Noise Cancellation=Active, Battery Life=30 Hours";
    
	public static void main(String headPhone[]){
        
        String color = "Black";
        String battery = "Up to 30 Hours";
		String made = "India";
		
        System.out.println("Product Details are");
        System.out.println("Product name: " + prodName);
        System.out.println("Product brand: " + prodBrand);
        System.out.println("Features: " + features);
        System.out.println("Color: " + color);
        System.out.println("Battery life: " + battery);
        System.out.println("Product Made in:"+made);
    }
}
