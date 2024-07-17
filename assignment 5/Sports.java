class Sports{
		static String iplTeam[]={"Royal Challengers Bangalore","Chennai Super Kings","Delhi Capitals","Kolkata Knight Riders","Mumbai Indians","Punjab Kings","Rajasthan Royals","Sunrisers Hyderabad","Gujarat Titans","Lucknow Super Gaints"};
		static String bats[]={"Virat Kohli","Steve Smith","Kane Williamson","Joe Root","Rohit Sharma","Babar Azam","David Warner","Quinton de Kock","Aaron Finch","Shikhar Dhawan"};
		static String bowls[]={"Pat Cummins","Kagiso Rabada","Jasprit Bumrah","Trent Boult","Rashid Khan","Josh Hazlewood","Ravichandran Ashwin","Mohammed Shami","Mitchell Starc","Shaheen Afridi"};
		static String teams[]={"England","India","New Zealand","Australia","South Africa","Pakistan","Bangladesh","Sri Lanka","West Indies","Afghanistan"};
	public static void main(String sport[]){
	
	/*System.out.println("The IPL teams are:\n"+"1." + ipl[0] + "\n" +"2." + ipl[1] + "\n" + "3." + ipl[2] + "\n" + "4." + ipl[3] + "\n" + "5." + ipl[4] + "\n" + "6." + ipl[5] + "\n" + "7." + ipl[6] + "\n" + "8." + ipl[7] + "\n"+ "9." + ipl[8] + "\n" + "10." + ipl[9]);
	System.out.println();
	System.out.println("The Top 10 Batsmens are:\n"+"1."+bat[0]+"\n" +"2."+bat[1]+"\n" +"3."+bat[2]+"\n" +"4."+bat[3]+"\n" +"5."+bat[4]+"\n" +"6."+bat[5]+"\n" +"7."+bat[6]+"\n" +"8."+bat[7]+"\n" +"9."+bat[8]+"\n" +"10."+bat[9]);
	System.out.println();
	System.out.println("The Top 10 Bowlers are:\n"+"1."+bowl[0]+"\n" +"2."+bowl[1]+"\n" +"3."+bowl[2]+"\n" +"4."+bowl[3]+"\n" +"5."+bowl[4]+"\n" +"6."+bowl[5]+"\n" +"7."+bowl[6]+"\n" +"8."+bowl[7]+"\n" +"9."+bowl[8]+"\n" +"10."+bowl[9]);
	System.out.println();
	System.out.println("The Top 10 ICC Teams are:\n"+"1."+team[0]+"\n" +"2."+team[1]+"\n" +"3."+team[2]+"\n" +"4."+team[3]+"\n" +"5."+team[4]+"\n" +"6."+team[5]+"\n" +"7."+team[6]+"\n" +"8."+team[7]+"\n" +"9."+team[8]+"\n" +"10."+team[9]);
	*/
	System.out.println("The IPL teams are:");
	for(int i=0;i<10;i++)
	{
		System.out.println(iplTeam[i]);
	}
	System.out.println();
	System.out.println("The Top 10 Batsmens are:");
	for(int j=0;j<10;j++)
	{
		System.out.println(bats[j]);
	}
	System.out.println();	
	System.out.println("The Top 10 Bowlers are:");
	for(int k=0;k<10;k++)
	{
		System.out.println(bowls[k]);
	}
	System.out.println();
	System.out.println("The Top 10 ICC Teams are:");
	for(int l=0;l<10;l++)
	{
		System.out.println(teams[l]);
	}
	}
	
}