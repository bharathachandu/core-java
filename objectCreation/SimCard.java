class SimCard {
    int id;
    String name;
    String plan;
    
    public void communication() {
        System.out.println("Using SimCard: " + name + " Plan: " + plan + " for communication.");
    }
    
    public boolean createSimCard(int id, String name, String plan) {
        boolean isSimCardCreated = false;
        if (name != null && plan != null && id > 0) {
            this.id = id;
            this.name = name;
            this.plan = plan;
            isSimCardCreated = true;
        } else {
            System.out.println("Enter correct details!!");
        }
        return isSimCardCreated;
    }
    
    public void getSimDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Plan: " + plan);
    }
}