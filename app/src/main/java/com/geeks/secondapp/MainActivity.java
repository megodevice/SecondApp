package com.geeks.secondapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardView = findViewById(R.id.card_view);
        cardView.setBackgroundResource(R.drawable.bg_card);

        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(v -> {
            if (cardView.getAlpha() == 1) cardView.animate().alpha(0); else cardView.animate().alpha(1);
        });

        Button bigButton = findViewById(R.id.big_button);
        LinearLayout container = findViewById(R.id.container);
        bigButton.setOnClickListener(v -> {
            if (container.getVisibility() == View.VISIBLE) container.setVisibility(View.GONE); else container.setVisibility(View.VISIBLE);
        });

        Button circleButton = findViewById(R.id.circle_button);
        EditText editText = findViewById(R.id.text_edit);
        circleButton.setOnClickListener(v -> {
            Snackbar.make(findViewById(R.id.main_layout),
                    editText.getText().toString(), Snackbar.LENGTH_LONG).setAction("Закрыть", v1 -> {
                Toast.makeText(MainActivity.this, "Закрыто", Toast.LENGTH_SHORT).show();
            }).show();
        });

    }
}