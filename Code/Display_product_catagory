package com.example.identity_creator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Display_product_catagory extends AppCompatActivity {
    ImageView food_img,home_decorate_img,other_img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        food_img=findViewById(R.id.addFood);
        home_decorate_img=findViewById(R.id.addHomeProduct);
        other_img=findViewById(R.id.addOthers);

        food_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent food= new Intent(Display_product_catagory.this,Foods.class);
                startActivity(food);
            }
        });
        home_decorate_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeDeco =new Intent(Display_product_catagory.this,homeDecoration.class);
                startActivity(homeDeco);
            }
        });

        home_decorate_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Other =new Intent(Display_product_catagory.this,OthersProduct.class);
                startActivity(Other);
            }
        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_product_catagory);
    }
}
