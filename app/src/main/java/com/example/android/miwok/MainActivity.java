package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    TextView numbers,familyMembers,colors,phrases;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numbers=(TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNumber();
            }
        });
        familyMembers=(TextView) findViewById(R.id.family);
        familyMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFamily();
            }
        });
        colors=(TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openColors();
            }
        });
        phrases=(TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPhrases();
            }
        });

    }
    private void openNumber()
    {
        Intent intent=new Intent(this,NumberActivity.class);
        startActivity(intent);

    }
    private void openFamily()
    {
        Intent intent= new Intent(this,FamilyActivity.class);
        startActivity(intent);
    }
    private void openColors()
    {
        Intent intent= new Intent(this,ColorsActivity.class);
        startActivity(intent);
    }
    private void openPhrases()
    {
        Intent intent= new Intent(this,PhrasesActivity.class);
        startActivity(intent);
    }
}