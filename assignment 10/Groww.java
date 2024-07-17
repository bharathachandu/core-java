class Groww{
static String name;
static long ph;
static long aadhar;
static String pan;
static int mpin;
static String pwd;
public static boolean createAccount(String uName,long phone,long aad,String pNo,int mp,String password)
{
boolean isAccountCreated=false;
 name=uName;
 ph=phone;
 aadhar=aad;
 pan=pNo;
 mpin=mp;
 pwd=password;
 return isAccountCreated;
}
public static void getDetails()
{
System.out.println("the name is "+name);
System.out.println("the phone number is "+ph);
System.out.println("the Aadhar number is "+aadhar);
System.out.println("the pan number is "+pan);
System.out.println("the mpin is "+mpin);
System.out.println("the password is "+pwd);
}
}