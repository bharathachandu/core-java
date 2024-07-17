class Amazon{
static String fName;
static String lName;
static String uName;
static String Email;
static long phNo;
static int otp;
static String pwd;
static String cPwd;

public static boolean createCustomerAccount(String firstName,String lastName,String userName,String email,long phoneNumber,int oneTimePassword,String password,String confirmPassword){
boolean isAccountCreated=false;
fName=firstName;
lName=lastName;
uName=userName;
Email=email;
phNo=phoneNumber;
otp=oneTimePassword;
pwd=password;
cPwd=confirmPassword;
return isAccountCreated;	
}
public static void getDetails(){
System.out.println("the first name is "+fName);
System.out.println("the last name is "+lName);
System.out.println("the user name is "+uName);
System.out.println("the email id is "+Email);
System.out.println("the phone number is "+phNo);
System.out.println("the one time password is "+otp);
System.out.println("the password is "+pwd);
System.out.println("the confirm password is "+cPwd);
}
}