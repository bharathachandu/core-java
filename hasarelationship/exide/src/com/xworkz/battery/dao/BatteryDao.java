package com.xworkz.battery.dao;

import com.xworkz.battery.dto.BatteryDto;

public class BatteryDao {
    BatteryDto dto;

    public boolean createBattery(BatteryDto dto) {
        boolean isBatteryCreated = false;
        if (dto != null ) {
            this.dto= dto;

            isBatteryCreated = true;
        }
        return isBatteryCreated;
    }

    public void displayBatteryInfo() {
        System.out.println("---------------------------------------------");
        System.out.println("The Battery Brand is: " + dto.brand);
        System.out.println("The Type is: " + dto.type);
        System.out.println("The Capacity is: " + dto.capacity + " mAh");
        System.out.println("The Voltage is: " + dto.voltage + " V");
        System.out.println("Rechargeable: " + dto.rechargeable);
        System.out.println("The Price is: Rs." + dto.price);
        System.out.println("---------------------------------------------");
    }
}
