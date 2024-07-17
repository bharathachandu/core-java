class Kotak{
static String name;
static String dob;
static String pan;
static long aadhar;
static String email;
static long phone;
static String type;
static String nominee;
static int age;
public static boolean createAccount(String n,String d,String p,long a,String e,long pa,String t,String na,int ag){
boolean isAccountCreated=false;
boolean isNameValid=false;
boolean isDobValid=false;
boolean isPanValid=false;
boolean isAadharValid=false;
boolean isEmailValid=false;
boolean isPhoneValid=false;
boolean isTypeValid=false;
boolean isNomineeValid=false;
boolean isAgeValid=false; 
if(n!=null)
{
 name=n;
 isNameValid=true;
}
else
{
	System.out.println("enter the valid name");	
} 
if(d!=null)
{
	dob=d;
	isDobValid=true;
} 
else
{
	System.out.println("enter the valid dob");	
} 
if(p!=null)
{
	pan=p;
	isPanValid=true;
}
else
{
	System.out.println("enter the valid pan");	
} 
 if(a>=0)
 {
	 aadhar=a;
	 isAadharValid=true;
 }
 else
{
	System.out.println("enter the valid aadhar");	
} 
if(e!=null)
{
	email=e;
	isEmailValid=true;
}
 else
{
	System.out.println("enter the valid aadhar");	
}
if(pa>=0)
{
	phone=pa;
	isPhoneValid=true;
}
else
{
	System.out.println("enter the valid phone number");	
} 
if(t!=null)
{
	type=t;
	isTypeValid=true;
}
else
{
	System.out.println("enter the valid account type");	
}
if(na!=null)
{
	nominee=na;
	isNomineeValid=true;
}
else
{
	System.out.println("enter the valid nominee");	
}
if(ag>=0)
{
	age=ag;
	isAgeValid=true;
}
else
{
	System.out.println("enter the valid age");	
}
if(isNameValid && isNameValid && isDobValid && isPanValid && isAadharValid && isEmailValid && isPhoneValid && isTypeValid && isNomineeValid && isAgeValid )
{	
 isAccountCreated=true;
}
else
{
 System.out.println("please provide the valid details");
}
return isAccountCreated;
}
public static void getDetails()
{

	System.out.println("the name is "+name);


	System.out.println("the date of birth is "+dob);


	System.out.println("the pan is "+pan);


	System.out.println("the aadhar is "+aadhar);


	System.out.println("the email is "+email);


	System.out.println("the phone number is "+phone);


	System.out.println("the type is "+type);


	System.out.println("the nominee is "+nominee);


	System.out.println("the age is "+age);


}

}