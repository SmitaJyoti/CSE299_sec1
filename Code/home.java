package com.example.identity_creator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
      Button profile,displayProduct,addInCart,About,logOut;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button profile=findViewById(R.id.profile);
        Button displayProduct=findViewById(R.id.Display_product);
        Button addInCart=findViewById(R.id.add_cart);
        Button About=findViewById(R.id.about);
        Button logOut=findViewById(R.id.logout);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goProfile= new Intent(Home.this,Profile.class);
                startActivity(goProfile);
            }
        });

        displayProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent productCatagory= new Intent(Home.this,Display_product_catagory.class);
                startActivity(productCatagory);
            }
        });

        addInCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent productCatagory= new Intent(Home.this,Display_product_catagory.class);
                startActivity(productCatagory);
            }
        });

        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goAbout= new Intent(Home.this,about.class);
                startActivity(goAbout);
            }
        });

       logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gologin= new Intent(Home.this,login.class);
                startActivity(gologin);
            }
        });
    }
}
