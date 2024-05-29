package com.example.en_proiect;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.en_proiect.R;

public class menu_questionnaire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_questionnaire);
    }

    public void onTestSelected(View view) {
        int id = view.getId();
        if (id == R.id.btn_test1) {
            Intent intent = new Intent(this, quiz1.class);
            startActivity(intent); // Lansează activitatea EN2021
        } else if (id == R.id.btn_test2) {
            Intent intent = new Intent(this, quiz2.class);
            startActivity(intent); // Lansează activitatea EN2021
        } else if (id == R.id.btn_test3) {
            Intent intent = new Intent(this, quiz3.class);
            startActivity(intent); // Lansează activitatea EN2021
        }
        Button backButton = findViewById(R.id.btn_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
