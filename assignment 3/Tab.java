class Tab{
	
	static String prodName = "iPad Air (2020)";
    static String prodBrand = "Apple";
    static String features = "Display=10.9-inch Liquid Retina, Chip=A14 Bionic";
		
    public static void main(String tab[]){
        
        String color = "Sky Blue";
        String battery = "Up to 10 Hours";
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
