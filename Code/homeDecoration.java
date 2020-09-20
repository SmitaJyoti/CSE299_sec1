package com.example.identity_creator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
public class homeDecoration {
    private String name;
    private String image;
    private String description;
    private String price;



    public homeDecoration(){}

    public homeDecoration(String name, String description, String price, String image) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.price = price;

    }

    // Getter Methods

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }



    // Setter Methods

    public void setName(String Name) {
        this.name = Name;
    }

    public void setImage(String Image) {
        this.image = Image;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }

    public void setPrice(String Price) {
        this.price = Price;
    }


}


