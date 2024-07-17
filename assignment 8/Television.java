class Television{
static boolean isConnected;
static int currentVolume;
static int minVolume;
static int maxVolume=10;
public static boolean switchOnOrOff()
{System.out.println("SwitchONorOff method is started");
isConnected = (!isConnected) ? true:false;
/*{
 
 System.out.println("the Television is Switched on");
}
else if(isConnected==true)
{
 
 System.out.println("the Television is Switched off");
}*/
System.out.println("SwitchONorOff method is ended");
System.out.println();
return isConnected;
}
public static void details()
{
 System.out.println("details method started");
 String brand = "Boat";
 double price = 5000.00;
 System.out.println("the brand name of the Television is "+brand);
 System.out.println("The price is "+price);
 System.out.println("details method ended");
 System.out.println();
}
public static void increaseVolume()
{
	if(isConnected==true)
	{	
		System.out.println("The increase volume method is started");
		if(currentVolume < maxVolume)
		{
			currentVolume=currentVolume+1;
			System.out.println("The volume is increased to "+currentVolume);
		}
		else
		{
			System.out.println("The volume is at maximum");
		}
	}
	else
	{
		System.out.println("The Television is not turned on to carry out increase volume operation");
	}
	System.out.println("The increase volume method is ended");
	System.out.println();
}
public static void decreaseVolume()
{
	if(isConnected==true)
	{
		System.out.println("The decrease volume method is started");
		if(currentVolume > minVolume)
		{
			currentVolume=currentVolume-1;
			System.out.println("The volume is decreased to "+currentVolume);
		}
		else
		{
			System.out.println("The volume is at minimum");
		}
	}
	else
	{
		System.out.println("The Television is not turned on to carry out decrease volume operation");
	}	
	System.out.println("The decrease volume method is ended");
	System.out.println();
}
}