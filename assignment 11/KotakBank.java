class KotakBank{

public static void main(String bank[])
{/*static String name;
static String dob;
static String pan;
static long aadhar;
static String email;
static long phone;
static String type;
static String nominee;
static int age;*/
boolean isCreated = Kotak.createAccount("bharath A","15/11/2002","gdhsdyttyda4368",87654687787L,"bharath.anand.m@gmail.com",8461027689L,"savings","myself",22);
if(isCreated==true){
Kotak.getDetails();
System.out.println("account created ");
}
else
{
	System.out.println("account not created");
}

}

}