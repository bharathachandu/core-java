class Prime{
		static String topTen[]={"The Boys","Bujji And Bhairava","The Iron Claw","Kung Fu Panda 4","The Good Doctor","Panchayat","GhostBusters","Tokya Revengers","The Beast","Interview with the Vampire"};
		static String english[]={"The Shawshank Redemption","The Godfather","Pulp Fiction","The Dark Knight","Forrest Gump ","Schindler's List","Inception","Fight Club","The Matrix","Goodfellas","The Silence of the Lambs","The Lord of the Rings: The Fellowship of the Ring","Gladiator","The Departed","The Green Mile","Inglourious Basterds","The Prestige","Titanic","Saving Private Ryan","The Shawshank Redemption","The Lion King","Fast5","Fast6","Fast7","Fast8",};
		static String kannada[]={"Mungaru Male","Lucia","Ulidavaru Kandanthe","RangiTaranga","Kirik Party","Duniya","Mythri","KGF Chapter 1","Bhoothayyana Maga Ayyu","Rajakumara","Mungaru Male 2","Thithi","Katha Sangama","Aa Karaala Ratri","Ondu Motteya Kathe","U Turn","Nathicharami","Gultoo","Dia","Godhi Banna Sadharana Mykattu","Kirathaka","Rama Rama Re","Ricky","Sarkari Hi. Pra. Shaale, Kasaragodu, Koduge: Ramanna Rai","Bell Bottom"};
		static String hindi[]={"Sholay", "Dilwale Dulhania Le Jayenge", "Lagaan", "Gangs of Wasseypur", "3 Idiots", "Dangal", "Queen", "Andaz Apna Apna", "Swades", "Zindagi Na Milegi Dobara", "Taare Zameen Par", "Gully Boy", "Kabhi Khushi Kabhie Gham", "PK", "Munna Bhai MBBS", "Om Shanti Om", "Kahaani", "Haider", "Jab We Met", "Barfi!", "Dil Chahta Hai", "Rang De Basanti", "Chak De! India", "Bajrangi Bhaijaan", "Dil Se"};
		static String series[]={"Crash Landing on You", "Goblin", "Descendants of the Sun", "Itaewon Class", "Hospital Playlist", "My Love from the Star", "Reply 1988", "Signal", "Kingdom", "Mr. Sunshine", "Strong Woman Do Bong Soon", "Hotel Del Luna", "Vincenzo", "What's Wrong with Secretary Kim", "The Uncanny Counter", "It's Okay to Not Be Okay", "W", "Stranger", "Love Alarm", "Sky Castle", "My Mister", "Moon Lovers: Scarlet Heart Ryeo", "Her Private Life", "Memories of the Alhambra", "Start-Up"};
	public static void main(String prime[]){
	
	/*System.out.println("The Top 10 movies in prime are :\n"+"1."+top[0]+"\n"+"2."+top[1]+"\n"+"3."+top[2]+"\n"+"4."+top[3]+"\n"+"5."+top[4]+"\n"+"6."+top[5]+"\n"+"7."+top[6]+"\n"+"8."+top[7]+"\n"+"9."+top[8]+"\n"+"10."+top[9]);
	System.out.println();
	System.out.println("The Top 25 English movies in prime are :\n"+"1."+eng[0]+"\n"+"2."+eng[1]+"\n"+"3."+eng[2]+"\n"+"4."+eng[3]+"\n"+"5."+eng[4]+"\n"+"6."+eng[5]+"\n"+"7."+eng[6]+"\n"+"8."+eng[7]+"\n"+"9."+eng[8]+"\n"+"10."+eng[9]+"\n"+"11."+eng[10]+"\n"+"12."+eng[11]+"\n"+"13."+eng[12]+"\n"+"14."+eng[13]+"\n"+"15."+eng[14]+"\n"+"16."+eng[15]+"\n"+"17."+eng[16]+"\n"+"18."+eng[17]+"\n"+"19."+eng[18]+"\n"+"20."+eng[19]+"\n"+"21."+eng[20]+"\n"+"22."+eng[21]+"\n"+"23."+eng[22]+"\n"+"24."+eng[23]+"\n"+"25."+eng[24]);
	System.out.println();
	System.out.println("The Top 25 Kannada movies in prime are :\n"+"1."+kan[0]+"\n"+"2."+kan[1]+"\n"+"3."+kan[2]+"\n"+"4."+kan[3]+"\n"+"5."+kan[4]+"\n"+"6."+kan[5]+"\n"+"7."+kan[6]+"\n"+"8."+kan[7]+"\n"+"9."+kan[8]+"\n"+"10."+kan[9]+"\n"+"11."+kan[10]+"\n"+"12."+kan[11]+"\n"+"13."+kan[12]+"\n"+"14."+kan[13]+"\n"+"15."+kan[14]+"\n"+"16."+kan[15]+"\n"+"17."+kan[16]+"\n"+"18."+kan[17]+"\n"+"19."+kan[18]+"\n"+"20."+kan[19]+"\n"+"21."+kan[20]+"\n"+"22."+kan[21]+"\n"+"23."+kan[22]+"\n"+"24."+kan[23]+"\n"+"25."+kan[24]);
	System.out.println();
	System.out.println("The Top 25 Hindi movies in prime are :\n"+"1."+hin[0]+"\n"+"2."+hin[1]+"\n"+"3."+hin[2]+"\n"+"4."+hin[3]+"\n"+"5."+hin[4]+"\n"+"6."+hin[5]+"\n"+"7."+hin[6]+"\n"+"8."+hin[7]+"\n"+"9."+hin[8]+"\n"+"10."+hin[9]+"\n"+"11."+hin[10]+"\n"+"12."+hin[11]+"\n"+"13."+hin[12]+"\n"+"14."+hin[13]+"\n"+"15."+hin[14]+"\n"+"16."+hin[15]+"\n"+"17."+hin[16]+"\n"+"18."+hin[17]+"\n"+"19."+hin[18]+"\n"+"20."+hin[19]+"\n"+"21."+hin[20]+"\n"+"22."+hin[21]+"\n"+"23."+hin[22]+"\n"+"24."+hin[23]+"\n"+"25."+hin[24]);
	System.out.println();
	System.out.println("The Top 25 Korean Series in prime are :\n"+"1."+ser[0]+"\n"+"2."+ser[1]+"\n"+"3."+ser[2]+"\n"+"4."+ser[3]+"\n"+"5."+ser[4]+"\n"+"6."+ser[5]+"\n"+"7."+ser[6]+"\n"+"8."+ser[7]+"\n"+"9."+ser[8]+"\n"+"10."+ser[9]+"\n"+"11."+ser[10]+"\n"+"12."+ser[11]+"\n"+"13."+ser[12]+"\n"+"14."+ser[13]+"\n"+"15."+ser[14]+"\n"+"16."+ser[15]+"\n"+"17."+ser[16]+"\n"+"18."+ser[17]+"\n"+"9."+ser[18]+"\n"+"20."+ser[19]+"\n"+"21."+ser[20]+"\n"+"22."+ser[21]+"\n"+"23."+ser[22]+"\n"+"24."+ser[23]+"\n"+"25."+ser[24]);
	*/
	System.out.println("The Top 10 movies in prime are :");
	for(int i=0;i<10;i++)
	{
		System.out.println(topTen[i]);
	}
	System.out.println();
	System.out.println("The Top 25 English movies in prime are :");
	for(int j=0;j<25;j++)
	{
		System.out.println(english[j]);
	}
	System.out.println();
	System.out.println("The Top 25 Kannada movies in prime are :");
	for(int k=0;k<25;k++)
	{
		System.out.println(kannada[k]);
	}
	System.out.println();
	System.out.println("The Top 25 Hindi movies in prime are :");
	for(int l=0;l<25;l++)
	{
		System.out.println(hindi[l]);
	}
	System.out.println();
	System.out.println("The Top 25 Korean Series in prime are :");
	for(int m=0;m<25;m++)
	{
		System.out.println(series[m]);
	}
	System.out.println();
	}
} 	 	 	