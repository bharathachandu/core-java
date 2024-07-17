class Girias{

static String name="Girias";
static String ownerName="Bharath.A";
static String applianceNames[]={null,null,null,null,null,null,null,null,null,null,null,null};
static int index1;

public static boolean createhomeAppliance(String applianceName){
boolean isApplianceAdded=false;
System.out.println("Adding Home Appliances to Girias Started");
if(applianceName!=null)
{
	applianceNames[index1]=applianceName;
	index1++;
	isApplianceAdded=true;
}
else
{
	System.out.println("please provide valid home appliance names");
}
System.out.println("Adding Home Appliances to Girias Ended");
return isApplianceAdded;
}
public static void getHomeAppliances()
{
	System.out.println("The Added Home Appliances Details are:");
for(String applianceName:applianceNames)
{
	System.out.println("Appliance Name :"+applianceNameName);
}
return;

}


}