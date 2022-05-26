package com.pbm.ramadhanberkah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.pbm.ramadhanberkah.Hadist.HadistActivity;
import com.pbm.ramadhanberkah.Kuis.QuizActivity;

public class SerbaSerbiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serba_serbi);

        //deklarasi variabel
        CardView cvHadist, cvNgabuburit ,cvKuis;

        //Menginisialisasi id ke dalam variabel
        cvHadist = findViewById(R.id.cv_hadist);
        cvNgabuburit = findViewById(R.id.cv_ngabuburit);
        cvKuis = (CardView) findViewById(R.id.cv_kuis);

//        //cvSerbaSerbi Event Handler Onclick
        cvHadist.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(SerbaSerbiActivity.this, HadistActivity.class);
               startActivity(intent);
           }
      });

        //cvNgabuburit Event Handler Onclick
        cvNgabuburit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SerbaSerbiActivity.this, NgabuburitActivity.class);
                startActivity(intent);
            }
        });

        //cvKuis Event Handler Onclick
        cvKuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SerbaSerbiActivity.this, QuizActivity.class);
                startActivity(intent);
            }
        });
    }
}