class SunGlasses {
    String name;
    String type;
    int price;
    
    public void styling() {
        System.out.println("Styling with " + name + " " + type + " glasses.");
		
	}
	public boolean createProducts( String name,String type,int price){
		
		boolean isProductCreated = false;
		if(name != null && type != null && price > 0){
			this.name = name;
			this.type = type;
			this.price = price;
			isProductCreated = true;	
		}else System.out.println("Enter correct deatils !!");
		
	return isProductCreated;	
    }
	public void getProductDetails(){
		System.out.println("the name of glass is"+this.name);
		System.out.println("the type of glass is"+this.type);
		System.out.println("the price of glass is"+this.price);
		
		
	}
	
}
