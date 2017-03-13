package com.example.dell.finalchatapp;

/**
 * Created by dell on 13/03/2017.
 */

public class Registrations {

    private String email;
    private String phone_number;

    public Registrations(){
        //Required empty constructor
    }
    public Registrations(String email,String phonenumber)
    {
        this.email = email;
        this.phone_number = phonenumber;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPhonenumber()
    {
        return phone_number;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhonenumber(String phonenumber)
    {
        this.phone_number = phonenumber;
    }
}
