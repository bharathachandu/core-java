package com.xworkz.passport.dao;

import com.xworkz.passport.dto.PassportDto;

public class PassportDao {

    PassportDto dto;


    public boolean createPassport(PassportDto dto){
        boolean isAccountCreated=false;
        if(null!=dto ){
            this.dto=dto;
            isAccountCreated=true;
        }
        else
        {
            System.out.println("please provide the valid details");
        }
        return isAccountCreated;
    }
    public void getDetails()
    {
        System.out.println("The CPVLocation:"+dto.cpvLoc);
        System.out.println("The DCDRLocation:"+dto.dcdrLoc);
        System.out.println("The Name is:"+dto.nam);
        System.out.println("The Sur Name is:"+dto.sur);
        System.out.println("The dob is:"+dto.d);
        System.out.println("The email is:"+dto.e);
        System.out.println("is the email login same:"+dto.isEmail);
        System.out.println("The Login Id is:"+dto.login);
        System.out.println("The Password is:"+dto.p);
        System.out.println("The Confirm password is:"+dto.c);
        System.out.println("The Hint Question is:"+dto.hq);
        System.out.println("The Hint Answer is:"+dto.ha);
        System.out.println("The Captcha is:"+dto.ca);
    }

}
