package com.example.en_proiect;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;

import com.example.en_proiect.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.menu_about) {
            Intent aboutIntent = new Intent(this, menu_about.class);
            startActivity(aboutIntent);
            return true;
        } else if (itemId == R.id.variante_rezolvate) {
            Intent solvedVariantsIntent = new Intent(this, variante_rezolvate.class); // Numele clasei trebuie să fie corect
            startActivity(solvedVariantsIntent);
            return true;
        } else if (itemId == R.id.menu_other_resources) {
            Intent solvedVariantsIntent = new Intent(this, menu_other_resources.class); // Numele clasei trebuie să fie corect
            startActivity(solvedVariantsIntent);
            return true;
        } else if (itemId == R.id.menu_questionnaire) {
            Intent solvedVariantsIntent = new Intent(this, menu_questionnaire.class); // Numele clasei trebuie să fie corect
            startActivity(solvedVariantsIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
