class Microwave{
static boolean isConnected;
static int currentTemp;
static int minTemp;
static int maxTemp=6;
public static void switchOnOrOff()
{System.out.println("SwitchONorOff method is started");
if(isConnected==false)
{
 isConnected=true;
 System.out.println("the Microwave is Switched on");
}
else if(isConnected==true)
{
 isConnected=false;
 System.out.println("the Microwave is Switched off");
}
System.out.println("SwitchONorOff method is ended");
System.out.println();
}
public static void details()
{
 System.out.println("details method started");
 String brand = "Samsung";
 double price = 8000.00;
 System.out.println("the brand name of the Microwave is "+brand);
 System.out.println("The price is "+price);
 System.out.println("details method ended");
 System.out.println();
}
public static void increaseTemp()
{
	if(isConnected==true)
	{	
		System.out.println("The increase Temperature method is started");
		if(currentTemp < maxTemp)
		{
			currentTemp=currentTemp+1;
			System.out.println("The Temperature is increased to "+currentTemp);
		}
		else
		{
			System.out.println("The Temperature is at maximum");
		}
	}
	else
	{
		System.out.println("The Microwave is not turned on to carry out increase Temperature operation");
	}
	System.out.println("The increase Temperature method is ended");
	System.out.println();
}
public static void decreaseTemp()
{
	if(isConnected==true)
	{
		System.out.println("The decrease Temperature method is started");
		if(currentTemp > minTemp)
		{
			currentTemp=currentTemp-1;
			System.out.println("The Temperature is decreased to "+currentTemp);
		}
		else
		{
			System.out.println("The Temperature is at minimum");
		}
	}
	else
	{
		System.out.println("The Microwave is not turned on to carry out decrease Temperature operation");
	}	
	System.out.println("The decrease Temperature method is ended");
	System.out.println();
}
}