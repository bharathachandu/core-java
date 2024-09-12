package com.xworkz.passportapp;

import com.xworkz.passportapp.passport.Passport;
import com.xworkz.passportapp.passportimp.PassportImpl;
import com.xworkz.passportapp.user.User;

public class PassportRunner {
    public static void main(String[] args) {

        User user = new User();
        user.setUserName("Bharath A");
        user.setUserId(1);
        user.setUserAge(21);

        Passport passport = new PassportImpl();
        passport.addUser(user);
        passport.getUser();
        passport.updateUserDetails(21);
        System.out.println();
        passport.getUser();
    }
}
