
package com.example.identity_creator;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class signup extends AppCompatActivity {

    //variables
   TextInputLayout regFullName,regUsername,regContactNumber,regEmail,regPassword;
   Button regBtn;
   RadioButton regA,regC;
   ProgressBar regProgress;

   DatabaseReference reference;
   users Users;


   @Override
   protected void onCreate(final Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_signup);
       regFullName=findViewById(R.id.fullname);
       regUsername=findViewById(R.id.username);
       regContactNumber=findViewById(R.id.contactnumber);
       regEmail=findViewById(R.id.email);
       regPassword=findViewById(R.id.password);
       regBtn=findViewById(R.id.register);
       regA=findViewById(R.id.admin);
       regC=findViewById(R.id.customer);
       regProgress=findViewById(R.id.progressBar);
       reference=FirebaseDatabase.getInstance().getReference().child("users");
       Users=new users();
       regBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Users.setFullName(regFullName.getEditText().toString().trim());
               Users.setUsername(regUsername.getEditText().toString().trim());
               Users.setEmail(regEmail.getEditText().toString().trim());
               Users.setPassword(regPassword.getEditText().toString().trim());
               Users.setPassword(regContactNumber.getEditText().toString().trim());



               reference.push().setValue(Users);
               Toast.makeText(signup.this,"Registered Successfully",Toast.LENGTH_SHORT).show();
           }
       });


   });

}

