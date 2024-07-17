class Myntra{
	
	static long phone;
	static int onetp;
	static String fName;
	static String location;
	static int pin;
	
	
	public static boolean createAccoumt(long phoneNumber,int otp,String name,String address,int pinCode){
	boolean isAccountCreated = false;
				phone = phoneNumber;
				onetp	= otp;
				fName = name;
				location=address;
				pin=pinCode;
	
	return isAccountCreated;
	}
	public static void getDetails(){
		System.out.println("the enterd phone number is: "+ phone);
		System.out.println("the enterd otp  is: "+onetp);
		System.out.println("the enterd name is: "+fName);
		System.out.println("the enterd Address is: "+location);
		System.out.println("the pincode is: "+pin);
	
		
	}


}