package com.xworkz.passport;

import com.xworkz.passport.dao.PassportDao;
import com.xworkz.passport.dto.PassportDto;

public class PassportRunner {

    public static void main(String[] args) {



        PassportDto dto = new PassportDto();
        dto.cpvLoc="142";
        dto.dcdrLoc=123;
        dto.nam="Bharath";
        dto.sur="A";
        dto.d="a";
        dto.e="b";
        dto.isEmail=true;
        dto.login="bharatha";
        dto.p="q";
        dto.c="s";
        dto.hq="h";
        dto.ha="a";
        dto.ca="c";

        PassportDao dao = new PassportDao();
        dao.createPassport(dto);
        dao.getDetails();


    }

}
