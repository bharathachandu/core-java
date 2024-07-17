class Ksrtc{
static long phone;
static int otpwd;
static String fName;
static String email;
static long adharNum;


public static boolean createAccount(long phoneNumber,int otp,String fullName,String emailID,long adharId){

	boolean isAccountCreated = false;
		phone	= phoneNumber;
			otpwd	= otp;
				fName	= fullName;
				email	= emailID;
			adharNum	= adharId;




return isAccountCreated;
}

public static void getDetails(){
	System.out.println("the enterd phoneNumber is :"+phone);
	System.out.println("the enterd otp is :"+otpwd);
	System.out.println("the enterd full name is :"+fName);
	System.out.println("the enterd email id is :"+email);
	System.out.println("the enterd adharNum is :"+adharNum);


return;
}







}