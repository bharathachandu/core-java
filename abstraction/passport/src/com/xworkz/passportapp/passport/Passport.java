package com.xworkz.passportapp.passport;

import com.xworkz.passportapp.user.User;

public interface Passport {

    boolean addUser(User user);
    void getUser();
    void updateUserDetails(int age);
    void deleteUser();
}
