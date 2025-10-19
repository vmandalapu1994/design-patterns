package com.design_pattern.prototype;

import java.util.List;

public class PrototypeDriver {

    public static void main(String[] args) {
        GuestUser guestUser = new GuestUser("Vamsi", "email@gmail.com", "3232332322",
                List.of("Dancing", "Biking"));
        UserPrototype guestUser2 = guestUser.clone();
        System.out.println("Cloned user:" + guestUser2);
    }

}
