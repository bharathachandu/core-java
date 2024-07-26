package com.xworkz.showroom.dao;

import com.xworkz.showroom.dto.ShowroomDto;

public class ShowroomDao {
ShowroomDto dto;

public boolean createNames(ShowroomDto dto)
{
    boolean isCreated = false;
    System.out.println("Account is created");
    if (null != dto) {
        this.dto = dto;
        isCreated = true;

    }
    return isCreated;
}
public void getDetails()
{
    System.out.println("The Showroom Name is "+dto.name);
    System.out.println("The Showroom Owner Name is "+dto.ownerName);
    System.out.println("The Showroom Car Name is "+dto.carNames);
    System.out.println("The Showroom Car Price in Crore is "+dto.carPrice);
    System.out.println("The Showroom Bike Name is "+dto.bikeName);
    System.out.println("The Showroom Bike Price in Crore is "+dto.bikePrice);
}
}
