package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> number=new ArrayList<Word>();


        number.add(new Word("father","apa",R.drawable.family_father));
        number.add(new Word("mother","ata",R.drawable.family_mother));
        number.add(new Word("son","angsi",R.drawable.family_son));
        number.add(new Word("daughter","tune",R.drawable.family_daughter));
        number.add(new Word("older brother","taachi",R.drawable.family_older_brother));
        number.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother));
        number.add(new Word("older sister","tete",R.drawable.family_older_sister));
        number.add(new Word("younger sister","kollete",R.drawable.family_younger_sister));
        number.add(new Word("grand mother","ama",R.drawable.family_grandmother));
        number.add(new Word("grand father","apa",R.drawable.family_grandfather));


        WordAdapter Adapter = new WordAdapter(this,R.layout.list_item,number,R.color.category_family);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);

    }
}