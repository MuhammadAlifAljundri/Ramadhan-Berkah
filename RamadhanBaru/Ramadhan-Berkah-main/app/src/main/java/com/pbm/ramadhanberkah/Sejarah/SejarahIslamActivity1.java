package com.pbm.ramadhanberkah.Sejarah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.pbm.ramadhanberkah.R;

public class SejarahIslamActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah_islam1);

        //deklarasi variabel
        ImageView imgForward11;

        //Menginisialisasi id ke dalam variabel
        imgForward11 = findViewById(R.id.img_forwad11);

        //imgForward1 Event Handler Onclick
        imgForward11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.pbm.ramadhanberkah.Sejarah.SejarahIslamActivity1.this, SejarahIslamActivity2.class);
                startActivity(intent);
            }
        });
    }
}