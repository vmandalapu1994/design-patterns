package com.design_pattern.prototype;

import java.util.List;

public class GuestUser extends AbstractUser implements UserPrototype {

    public GuestUser(String name, String email, String mobileNum, List<String> hobbies) {
        this.name = name;
        this.email = email;
        this.mobileNum = mobileNum;
        this.hobbies = hobbies;
    }

    @Override
    public UserPrototype clone() {
        return new GuestUser(name, email, mobileNum, List.copyOf(hobbies));
    }

    @Override
    public String toString() {
        return "GuestUser{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNum='" + mobileNum + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
