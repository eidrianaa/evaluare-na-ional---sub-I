package com.example.en_proiect;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
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
        } else if (id == R.id.btn_test2) {
        } else if (id == R.id.btn_test3) {

        }
    }

    public void onBackPressed(View view) {
        super.onBackPressed();
    }
}
