package com.pbm.ramadhanberkah.Kisah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.pbm.ramadhanberkah.R;

public class KisahParaSahabatNabi3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_para_sahabat_nabi3);
        //deklarasi variabel
        ImageView imgBack2;

        //Menginisialisasi id ke dalam variabel
        imgBack2 = findViewById(R.id.img_back2);

        //imgBack2 Event Handler Onclick
        imgBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KisahParaSahabatNabi3Activity.this, KisahParaSahabatNabi2Activity.class);
                startActivity(intent);
            }
        });
    }
}