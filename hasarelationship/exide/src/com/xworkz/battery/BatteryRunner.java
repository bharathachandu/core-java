package com.xworkz.battery;

import com.xworkz.battery.dao.BatteryDao;
import com.xworkz.battery.dto.BatteryDto;

public class BatteryRunner {
    public static void main(String[] args) {

        BatteryDto dto = new BatteryDto();
        dto.brand = "EXIDE";
        dto.type = "Li";
        dto.capacity = 200;
        dto.voltage = 250;
        dto.rechargeable = true;
        dto.price = 1500.00;

        BatteryDao dao = new BatteryDao();
        dao.createBattery(dto);
        dao.displayBatteryInfo();
    }
}
