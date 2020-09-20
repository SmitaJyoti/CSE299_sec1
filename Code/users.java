package com.example.identity_creator;

import android.widget.RadioButton;

public class users {
     String fullName;
     String username;
     String contactNum;
     String email;
     String password;
     RadioButton regA;
     RadioButton regC;

    public users() {

    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getContactNum() {
        return contactNum;
    }
    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public RadioButton getRegA() {
        return regA;
    }
    public void setRegA(RadioButton regA) {
        this.regA = regA;
    }

    public RadioButton getRegC() {
        return regC;
    }
    public void setRegC(RadioButton regC) {
        this.regC = regC;
    }


}
