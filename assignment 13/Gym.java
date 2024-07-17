class Gym
	{

		static String name="Sri Annapoorneshwari Gym";
		static String ownerName="Bharath.A";
		static String equipmentNames[]={null,null,null,null,null,null,null,null};
		static int index1;

		public static boolean createGymEquipment(String equipmentName)
		{	
			boolean isEquipmentAdded=false;
			System.out.println("Adding Equipments to Gym Started");
			if(equipmentName!=null)
			{
				equipmentNames[index1]=equipmentName;
				index1++;
				isEquipmentAdded=true;
			}
			else
			{
				System.out.println("please provide valid Equipments names");
			}
			System.out.println("Adding Equipments to Gym Ended");
			return isEquipmentAdded;
		}
		public static void getGymEquipments()
		{
			System.out.println("The Added Equipments Details are:");
			for(String equipmentName:equipmentNames)
			{
				System.out.println("Equipment Name :"+equipmentName);
			}
		return;

		}

		public static boolean updateGymEquipment(String oldItem,String newItem)
		{
			boolean isEquipmentUpdated=false;
			for(int i=0;i<equipmentNames.length;i++)
			{
				if(equipmentNames[i]==oldItem)
				{
					equipmentNames[i]=newItem;
					isEquipmentUpdated=true;
				}
			}
			if(isEquipmentUpdated==false)
			{
				System.out.println("sorry old brand is not found");
			}
			return isEquipmentUpdated;
		}
	}