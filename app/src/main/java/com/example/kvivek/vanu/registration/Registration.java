package com.example.kvivek.vanu.registration;

import java.util.HashMap;

class Registration {
    private final String name;
    private final String password;
    private final String email;
    private final String phoneNumber;

    public Registration(HashMap<String, String> fields) {
        name = fields.get("name");
        password = fields.get("password");
        email = fields.get("email");
        phoneNumber = fields.get("phoneNumber");
    }

    public boolean addUser(HashMap<String, String> fields) {
//        User user = UserFactory.createUser(fields);
        return true;
    }


//    class User extends Hibernate{
//        private String name;
//        private String password;
//        private String email;
//        private String phoneNumber;
//
//        public void save(){
//            Hibernate.save(this);
//        }
//    }
}
