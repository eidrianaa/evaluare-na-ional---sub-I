package com.example.en_proiect;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.en_proiect.R;

public class quiz1 extends AppCompatActivity {

    private int score = 0;
    private final int totalScore = 30;
    private StringBuilder wrongQuestions = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        Button confirmButton = findViewById(R.id.confirmButton);
        Button backButton = findViewById(R.id.backButton);

        confirmButton.setOnClickListener(v -> {
            calculateScore();
            showResultsDialog();
        });

        backButton.setOnClickListener(v -> finish());
    }

    private void calculateScore() {
        score = 0;
        wrongQuestions.setLength(0); // Reset the list of wrong questions

        checkAnswer(R.id.answers1, R.id.answer1_a, "1");
        checkAnswer(R.id.answers2, R.id.answer2_b, "2");
        checkAnswer(R.id.answers3, R.id.answer3_c, "3");
        checkAnswer(R.id.answers4, R.id.answer4_a, "4");
        checkAnswer(R.id.answers5, R.id.answer5_b, "5");
        checkAnswer(R.id.answers6, R.id.answer6_b, "6");
    }

    private void checkAnswer(int groupId, int correctAnswerId, String questionNumber) {
        RadioGroup group = findViewById(groupId);
        if (group.getCheckedRadioButtonId() == correctAnswerId) {
            score += 5; // Each correct answer adds 5 points
        } else {
            if (wrongQuestions.length() > 0) wrongQuestions.append(", ");
            wrongQuestions.append(questionNumber);
        }
    }

    private void showResultsDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_quiz_results, null);

        TextView scoreText = dialogView.findViewById(R.id.score_text);
        scoreText.setText("Scorul tău este: " + score + " din " + totalScore);

        TextView wrongText = dialogView.findViewById(R.id.wrong_questions_text);
        if (wrongQuestions.length() > 0) {
            wrongText.setText("Ai greșit la întrebările: " + wrongQuestions.toString());
        } else {
            wrongText.setText("Nu ai greșit la nicio întrebare. Felicitări!");
        }

        Button retryButton = dialogView.findViewById(R.id.retry_button);
        retryButton.setOnClickListener(v -> {
            dismissDialog();
            recreate(); // Restart the activity to reset the quiz
        });

        Button backButton = dialogView.findViewById(R.id.back_button);
        backButton.setOnClickListener(v -> {
            dismissDialog();
            finish(); // Finish this activity and go back
        });

        builder.setView(dialogView);
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void dismissDialog() {
        // This method should dismiss the dialog if it's showing, but since it's created and shown locally, it will be dismissed automatically when a button is clicked.
    }
}
