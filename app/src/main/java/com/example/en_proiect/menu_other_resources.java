package com.example.en_proiect;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class menu_other_resources extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_other_resources); // Asigură-te că ai un layout cu acest nume
    }

    public void openWebPage(View view) {
        Uri webpage = Uri.EMPTY;
        int id = view.getId();
        if (id == R.id.btn_site1) {
            webpage = Uri.parse("https://site1.com");
        } else if (id == R.id.btn_site2) {
            webpage = Uri.parse("https://site2.com");
        }

        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void onBackPressed(View view) {
        // Acest cod va închide activitatea curentă și va reveni la activitatea precedentă
        super.onBackPressed();
    }


}
