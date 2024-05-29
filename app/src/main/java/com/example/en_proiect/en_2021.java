package com.example.en_proiect;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.en_proiect.R;

public class en_2021 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_en2021); // Asigură-te că numele layout-ului este corect


    }

    // Metoda pentru butonul de întoarcere definit în XML
    public void goBack(View view) {
        // Închide activitatea și revine la activitatea anterioară
        finish();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed(); // Aceasta va trata apăsarea butonului de întoarcere din toolbar
        return true;
    }
}
