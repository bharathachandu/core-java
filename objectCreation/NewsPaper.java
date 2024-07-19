class NewsPaper {
    int id;
    String companyName;
    int noOfPages;
    String language;
    int price;

    public void createNewsPaper(int id, String companyName, int noOfPages, String language, int price) {
        this.id = id;
        this.companyName = companyName;
        this.noOfPages = noOfPages;
        this.language = language;
        this.price = price;
    }

    public void getNewsPaperDetails() {
        System.out.println("ID: " + id);
        System.out.println("Company Name: " + companyName);
        System.out.println("Number of Pages: " + noOfPages);
        System.out.println("Language: " + language);
        System.out.println("Price: " + price);
        System.out.println();
    }
}
