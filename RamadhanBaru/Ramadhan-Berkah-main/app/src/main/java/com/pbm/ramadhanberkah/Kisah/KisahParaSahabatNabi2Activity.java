package com.pbm.ramadhanberkah.Kisah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.pbm.ramadhanberkah.R;

public class KisahParaSahabatNabi2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_para_sahabat_nabi2);

        //deklarasi variabel
        ImageView imgBack1, imgForwad2;

        //Menginisialisasi id ke dalam variabel
        imgBack1 = findViewById(R.id.img_back1);
        imgForwad2 = findViewById(R.id.img_forwad2);

        //imgBack1 Event Handler Onclick
        imgBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KisahParaSahabatNabi2Activity.this, KisahParaSahabatNabi1Activity.class);
                startActivity(intent);
            }
        });

        //imgForwad2 Event Handler Onclick
        imgForwad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KisahParaSahabatNabi2Activity.this, KisahParaSahabatNabi3Activity.class);
                startActivity(intent);
            }
        });
    }
}