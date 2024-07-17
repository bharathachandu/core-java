class BookMyShow{
static String location;
static String name;
static long no;
static String mail;
static int otp;
static String movie;
public static boolean createAccount(String loc,String nam,long number,String email,int oneTimePassword,String mov)
{boolean isAccountCreated=false;
 location=loc;
 name=nam;
 no=number;
 mail=email;
 otp=oneTimePassword;
 movie=mov;
 return isAccountCreated;
}
public static void getDetails()
{
 System.out.println("the location is "+location);
 System.out.println("the name is "+name);
 System.out.println("the phone number is "+no);
 System.out.println("the email id is "+mail);
 System.out.println("the one time password is "+otp);
 System.out.println("the movie to be picked is "+movie);
}
}