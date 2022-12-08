package com.example.quranversefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView Verse;
    public TextView SuraNum;
    public TextView VerseNum, NumVerse, NumSura;
    public Button btnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Verse = findViewById(R.id.Verse);
        btnSearch = findViewById(R.id.btnSearch);
        SuraNum = findViewById(R.id.SuraNum);
        VerseNum = findViewById(R.id.VerseNum);
        NumVerse = findViewById(R.id.NumAyat);
        NumSura = findViewById(R.id.NumSura);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Verse.setText("I am working");
            }
        });

    }
}