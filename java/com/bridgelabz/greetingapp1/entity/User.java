package com.bridgelabz.greetingapp1.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class User {

    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        String fN = (firstName==null)? "" : firstName;
        String lN = (lastName==null)? "" : lastName;
        return fN+""+lN;
    }
}
