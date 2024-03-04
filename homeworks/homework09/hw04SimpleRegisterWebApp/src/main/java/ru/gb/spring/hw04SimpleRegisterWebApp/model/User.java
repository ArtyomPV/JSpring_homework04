package ru.gb.spring.hw04SimpleRegisterWebApp.model;

import lombok.Data;


@Data
public class User {
    //region Private Fields
    private final String name;
    private final String password;
    private final String email;
    //endregion


//    //region Constructors
//    public User(String name, String password, String email) {
//        this.name = name;
//        this.password = password;
//        this.email = email;
//    }
//    //endregion
//
//
//    //region Getters
//    public String getName() {
//        return name;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//    //endregion
}
