package com.example.en_proiect;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
            webpage = Uri.parse("https://app.asq.ro");
        } else if (id == R.id.btn_site2) {
            webpage = Uri.parse("https://resursesmmateblog.wordpress.com/evaluare-nationala/");
        }
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            // Logica pentru cazul în care nu există o aplicație pentru a deschide URL-ul
            Log.e("IntentError", "No application can handle this request. Please install a web browser or check your URL.");
            Toast.makeText(this, "No application can handle this request. Please install a web browser.", Toast.LENGTH_LONG).show();
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
