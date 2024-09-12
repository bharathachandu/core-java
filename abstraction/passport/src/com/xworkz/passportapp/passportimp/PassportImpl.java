package com.xworkz.passportapp.passportimp;

import com.xworkz.passportapp.passport.Passport;
import com.xworkz.passportapp.user.User;

public class PassportImpl implements Passport {
    User user;

    @Override
    public boolean addUser(User user) {
        boolean isAdded=true;
        if(user!=null)
        {
            this.user=user;
        }
        return isAdded;
    }

    @Override
    public void getUser() {
        System.out.println(user);

    }

    @Override
    public void updateUserDetails(int age) {

    }

    @Override
    public void deleteUser() {

    }
}
