package com.example.en_proiect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class variante_rezolvate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variante_rezolvate);

        Button btnEN2021 = findViewById(R.id.btn_en_2021);
        Button btnEN2022 = findViewById(R.id.btn_en_2022);
        Button btnEN2023 = findViewById(R.id.btn_en_2023);
        Button btnBack = findViewById(R.id.btn_back);

        btnEN2021.setOnClickListener(v -> {
            Intent intent = new Intent(this, en_2021.class);
            startActivity(intent); // Lansează activitatea EN2021
        });


        btnEN2022.setOnClickListener(v -> {
            Intent intent = new Intent(this, en_2022.class);
            startActivity(intent);
        });

        btnEN2023.setOnClickListener(v -> {
            Intent intent = new Intent(this, en_2023.class);
            startActivity(intent);
        });

        btnBack.setOnClickListener(v -> finish());  // Închide activitatea curentă și întoarce-te la activitatea anterioară
    }
}
