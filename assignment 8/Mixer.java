class Mixer{
static boolean isConnected;
static int currentSpeed;
static int minSpeed;
static int maxSpeed=6;
public static void switchOnOrOff()
{System.out.println("SwitchONorOff method is started");
if(isConnected==false)
{
 isConnected=true;
 System.out.println("the Mixer is Switched on");
}
else if(isConnected==true)
{
 isConnected=false;
 System.out.println("the Mixer is Switched off");
}
System.out.println("SwitchONorOff method is ended");
System.out.println();
}
public static void details()
{
 System.out.println("details method started");
 String brand = "LG";
 double price = 6000.00;
 System.out.println("the brand name of the Mixer is "+brand);
 System.out.println("The price is "+price);
 System.out.println("details method ended");
 System.out.println();
}
public static void increaseSpeed()
{
	if(isConnected==true)
	{	
		System.out.println("The increase Speed method is started");
		if(currentSpeed < maxSpeed)
		{
			currentSpeed=currentSpeed+1;
			System.out.println("The Speed is increased to "+currentSpeed);
		}
		else
		{
			System.out.println("The Speed is at maximum");
		}
	}
	else
	{
		System.out.println("The Mixer is not turned on to carry out increase Speed operation");
	}
	System.out.println("The increase Speed method is ended");
	System.out.println();
}
public static void decreaseSpeed()
{
	if(isConnected==true)
	{
		System.out.println("The decrease Speed method is started");
		if(currentSpeed > minSpeed)
		{
			currentSpeed=currentSpeed-1;
			System.out.println("The Speed is decreased to "+currentSpeed);
		}
		else
		{
			System.out.println("The Speed is at minimum");
		}
	}
	else
	{
		System.out.println("The Mixer is not turned on to carry out decrease Speed operation");
	}	
	System.out.println("The decrease Speed method is ended");
	System.out.println();
}
}