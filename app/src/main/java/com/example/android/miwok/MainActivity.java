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
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.miwok.R.id.numbers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView number = (TextView)findViewById(numbers);



        number.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){
                Intent ni = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(ni);
            }});



        TextView color = (TextView)findViewById(R.id.colors);



        color.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){
                Intent ci = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(ci);
            }});

        TextView fam = (TextView)findViewById(R.id.family);



        fam.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){
                Intent fi = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(fi);
            }});


        TextView ph = (TextView)findViewById(R.id.phrases);

        ph.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){
                Intent pi = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(pi);
            }});


    }}
