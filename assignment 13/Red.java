class Red{

static String name="Red Chillies Entertainment";
static String ownerName="Bharath.A";
static String actorNames[]={null,null,null,null,null,null,null,null,null};
static int index1;

public static boolean addMovieActors(String actorName){
boolean isActorsAdded=false;
System.out.println("Adding Actors to Red Chillies Entertainment Started");
if(actorName!=null)
{
	actorNames[index1]=actorName;
	index1++;
	isActorsAdded=true;
}
else
{
	System.out.println("please provide valid Actors names");
}
System.out.println("Adding Actors to Red Chillies Entertainment Ended");
return isActorsAdded;
}
public static void getMovieActors()
{
	System.out.println("The Added Actors Details are:");
for(String actorName:actorNames)
{
	System.out.println("Actor Name :"+actorName);
}
return;

}


}