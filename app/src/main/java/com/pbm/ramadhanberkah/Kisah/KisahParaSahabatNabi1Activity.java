package com.pbm.ramadhanberkah.Kisah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.pbm.ramadhanberkah.R;

public class KisahParaSahabatNabi1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_para_sahabat_nabi1);

        //deklarasi variabel
        ImageView imgForward1;

        //Menginisialisasi id ke dalam variabel
        imgForward1 = findViewById(R.id.img_forwad1);

        //imgForward1 Event Handler Onclick
        imgForward1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KisahParaSahabatNabi1Activity.this, KisahParaSahabatNabi2Activity.class);
                startActivity(intent);
            }
        });
    }
}