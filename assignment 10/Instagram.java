class Instagram{
static String name;
static String uname;
static long ph;
static String mail;
static int age;
static String password;
public static boolean createAccount(String nam,String un,long no,String email,int ag,String pwd)
{
	boolean isAccountCreated = false;
	name=nam;
	uname=un;
	ph=no;
	mail=email;
	age=ag;
	password=pwd;
	return isAccountCreated;
}
public static void getDetails()
{
	System.out.println("the name is "+name);
	System.out.println("the user name is "+uname);
	System.out.println("the phone number is "+ph);
	System.out.println("the email id is "+mail);
	System.out.println("the age is "+age);
	System.out.println("the password is "+password);
}
}