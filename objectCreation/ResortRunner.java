class ResortRunner {

    public static void main(String[] args) {

        Resort resort1 = new Resort();
		resort1.createResort(5000.5,"Taj Exotica","Tata Group", 20);
        resort1.getResortDetails();
		System.out.println();
        
		Resort resort2 = new Resort();
		resort2.createResort(7000.0, "Oberoi Udaivilas", "Oberoi Group", 25);
        resort2.getResortDetails();
		System.out.println();
		
        Resort resort3 = new Resort();
		resort3.createResort(8500.75, "Leela Palace", "Leela Group", 30);
        resort3.getResortDetails();
		System.out.println();
		
        Resort resort4 = new Resort();
		resort4.createResort(6000.25,"ITC Grand Bharat", "ITC Group", 15);
        resort4.getResortDetails();
		System.out.println();
		
        Resort resort5 = new Resort();
		resort5.createResort(9000.0, "Amanbagh", "Amanbagh", 35);
        resort5.getResortDetails();
		System.out.println();
		
        Resort resort6 = new Resort();
		resort6.createResort(2670.0, "Ananda in the Himalayas", "IHHR Hospitality", 15);
        resort6.getResortDetails();
		System.out.println();
		
        Resort resort7 = new Resort();
		resort7.createResort(900.0, "Taj Lake Palace", "Tata Group", 5);
        resort7.getResortDetails();
		System.out.println();
		
        Resort resort8 = new Resort();
		resort8.createResort(9000.0, "Rambagh Palace", "Taj Group", 25);
        resort8.getResortDetails();
		System.out.println();
		
        Resort resort9 = new Resort();
		resort9.createResort(90256.0, "The Oberoi Vanyavilas", "Oberoi Group", 10);
        resort9.getResortDetails();
		System.out.println();
     
        Resort resort10 = new Resort();
		resort10.createResort(3375.0, "Sujan Jawai", "Sujan Luxury", 25);
        resort10.getResortDetails();
		System.out.println();
		
        Resort resort11 = new Resort();
		resort11.createResort(1677.0, "Kumarakom Lake Resort", "Paul Resorts", 8);
        resort11.getResortDetails();

		System.out.println();
        Resort resort12 = new Resort();
		resort12.createResort(3565.0,"The Tamara Coorg","Shruti Shibulal", 25);
        resort12.getResortDetails();
		
        
		System.out.println();
        Resort resort13 = new Resort();
		resort13.createResort(8674.0, "Orange County","Ramapuram Group", 25);
        resort13.getResortDetails();
		
       
		System.out.println();
        Resort resort14 = new Resort();
		resort14.createResort(3375.0, "The Serai", "Coffee Day Group", 25);
        resort14.getResortDetails();
		
		System.out.println();
        Resort resort15 = new Resort();
		resort15.createResort(3375.0,"Evolve Back", "Ramapuram Group", 25);
        resort15.getResortDetails();
		
        
    }
}


