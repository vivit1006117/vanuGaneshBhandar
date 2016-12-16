package com.example.kvivek.vanu.registeration;

import java.util.HashMap;

public class Register {
    private final String name;
    private final String password;
    private final String email;
    private final String phoneNumber;

    public Register(HashMap<String, String> fields) {
        name = fields.get("name");
        password = fields.get("password");
        email = fields.get("email");
        phoneNumber = fields.get("phoneNumber");
    }

    public boolean addUser() {
        return true;
    }
}
