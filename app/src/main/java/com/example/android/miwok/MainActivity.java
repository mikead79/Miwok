/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.onClick;
import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        //Find the view that shows the Numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        //Set a clicklistener to this view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                MainActivity.this.startActivity(numbersIntent);
            }
        });
        // Open the Family Members List activity when Family Members text is clicked.
        TextView family = (TextView) findViewById(R.id.family);
        //Set a clicklistener to this view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyMembersActivity.class);
                MainActivity.this.startActivity(familyIntent);
            }
        });
        // Open the Colors List activity when Colors text is clicked.
        TextView colors = (TextView) findViewById(R.id.colors);
        //Set a clicklistener to this view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                MainActivity.this.startActivity(colorsIntent);
            }
        });
        // Open the Phrases List activity when Phrases text is clicked.
        TextView phrases = (TextView) findViewById(R.id.phrases);
        //Set a clicklistener to this view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                MainActivity.this.startActivity(phrasesIntent);
            }
        });
    }

}
