class DrivingLicence{
static String birth;
static String learnerNumber;
static String lName;
static String dob;
static String rtoOffice; 
static String date;
public static boolean createDlDetails(String countryOfBirth,String learnerNo,String learnerName,String dateOfBirth,String rto,String dateofTest)
 {  boolean isDetailsCollected = false;
	birth=countryOfBirth;
	learnerNumber=learnerNo;
	lName=learnerName;
	dob=dateOfBirth;
	rtoOffice=rto;
	date=dateofTest;
	return isDetailsCollected;
 }
public static void getDetails()
{
	System.out.println("the birth country is "+birth);
	System.out.println("the learner's licence number is "+learnerNumber);
	System.out.println("the learner's name is "+lName);
	System.out.println("the date of birth is "+dob);
	System.out.println("the rto office is in "+rtoOffice);
	System.out.println("the date of test is "+date);
}
}