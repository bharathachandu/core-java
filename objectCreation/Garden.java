class Garden {
    String name;
    String place;
	
	public void createGarden(String name, String place) {
        this.name = name;
        this.place = place;
    }

    public void displayGardenDetails() {
        System.out.println("Name: " + name);
        System.out.println("Place: " + place);
        System.out.println();
    }
	
}