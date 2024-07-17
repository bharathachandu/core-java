import java.util.Scanner;
class Person{
	public static void main(String details[]){
		System.out.println("-----------------------------");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the Person's Id:");
		int personId=scan.nextInt();
		System.out.println("enter the Person's name:");
		String personName=scan.next();
		System.out.println("enter the Person's Age:");
		int age=scan.nextInt();
		System.out.println("enter the Person's Contact No:");
		long contactNo=scan.nextLong();
		System.out.println("enter the Person's EmailId:");
		String emailid = scan.next();
		System.out.println("enter the Person's DOB:");
		String dob=scan.next();
		System.out.println("enter the Person's Address:");
		String address=scan.next();
		System.out.println("enter the Person's Aadhar No:");
		long aadharNo=scan.nextLong();
		System.out.println("enter the Person's Blood Group:");
		String bloodGrp=scan.next();
		System.out.println("enter the Person's Gender:");
		String gender=scan.next();
		System.out.println("---------------------------");
		System.out.println("Details Of a Person");
		System.out.println("The Person ID is:"+ personId);
		System.out.println("The Person Name is:"+ personName);
		System.out.println("The Person Age is:"+ age);
		System.out.println("The Person Contact No is:"+contactNo);
		System.out.println("The Person Email Id is:"+emailid);
		System.out.println("The Person DOB is:"+dob);
		System.out.println("The Person Address is:"+address);
		System.out.println("The Person Aadhar No is:"+aadharNo);
		System.out.println("The Person Blood Group is:"+bloodGrp);
		System.out.println("The Person Gender is:"+gender);
	}
}