class GymRunner{

public static void main(String gym[])
{

	boolean isGymEquiped = Gym.createGymEquipment("Treadmills");
	System.out.println("Is Equipment Added:"+isGymEquiped);
	isGymEquiped = Gym.createGymEquipment("Ellipticals");
	System.out.println("Is Equipment Added:"+isGymEquiped);
	isGymEquiped = Gym.createGymEquipment("Stationary Bikes");
	System.out.println("Is Equipment Added:"+isGymEquiped);
	isGymEquiped = Gym.createGymEquipment("Rowing Machines");
	System.out.println("Is Equipment Added:"+isGymEquiped);
	isGymEquiped = Gym.createGymEquipment("Free Weights");
	System.out.println("Is Equipment Added:"+isGymEquiped);
	isGymEquiped = Gym.createGymEquipment("Cable Machines");
	System.out.println("Is Equipment Added:"+isGymEquiped);
	isGymEquiped = Gym.createGymEquipment("Squat Rack");
	System.out.println("Is Equipment Added:"+isGymEquiped);
	isGymEquiped = Gym.createGymEquipment("Dumbbells");
	System.out.println("Is Equipment Added:"+isGymEquiped);
	Gym.getGymEquipments();
	boolean isGymUpdated = Gym.updateGymEquipment("Treadmills","weight lift");
	System.out.println("Is Equipment Added:"+isGymUpdated);
	Gym.getGymEquipments();
}	
}