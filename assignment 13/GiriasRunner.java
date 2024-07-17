class GiriasRunner{

public static void main(String gym[])
{

	boolean isAppliancesAdd = Girias.createhomeAppliance("Coffee maker");
	System.out.println("Is Appliance Added:"+isAppliancesAdd);
	isAppliancesAdd = Girias.createhomeAppliance("Blender");
	System.out.println("Is Appliance Added:"+isAppliancesAdd);
	isAppliancesAdd = Girias.createhomeAppliance("Mixer");
	System.out.println("Is Appliance Added:"+isAppliancesAdd);
	isAppliancesAdd = Girias.createhomeAppliance("Toaster");
	System.out.println("Is Appliance Added:"+isAppliancesAdd);
	isAppliancesAdd = Girias.createhomeAppliance("Microwave");
	System.out.println("Is Appliance Added:"+isAppliancesAdd);;
	isAppliancesAdd = Girias.createhomeAppliance("Crockpot");
	System.out.println("Is Appliance Added:"+isAppliancesAdd);
	isAppliancesAdd = Girias.createhomeAppliance("Rice cooker.");
	System.out.println("Is Appliance Added:"+isAppliancesAdd);
	isAppliancesAdd = Girias.createhomeAppliance("Stove");
	System.out.println("Is Appliance Added:"+isAppliancesAdd);
	isAppliancesAdd = Girias.createhomeAppliance("Lamp");
	System.out.println("Is Appliance Added:"+isAppliancesAdd);
	isAppliancesAdd = Girias.createhomeAppliance("Lantern");
	System.out.println("Is Appliance Added:"+isAppliancesAdd);
	isAppliancesAdd = Girias.createhomeAppliance("Torch");
	System.out.println("Is Appliance Added:"+isAppliancesAdd);
	isAppliancesAdd = Girias.createhomeAppliance("Kettle");
	System.out.println("Is Appliance Added:"+isAppliancesAdd);
	Girias.getHomeAppliances();
}	
}