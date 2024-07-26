package com.xworkz.showroom;

import com.xworkz.showroom.dao.ShowroomDao;
import com.xworkz.showroom.dto.ShowroomDto;

public class ShowroomRunner {

    public static void main(String[] args) {

        ShowroomDto dto = new ShowroomDto();
        dto.name="Sri Annapoorneshwari cars";
        dto.ownerName="Bharath A";
        dto.carNames="Dodge Charger";
        dto.carPrice=12;
        dto.bikeName="Ducati";
        dto.bikePrice=1;

        ShowroomDao dao = new ShowroomDao();
        dao.createNames(dto);
        dao.getDetails();

    }
}
