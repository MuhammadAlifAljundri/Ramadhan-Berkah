package com.pbm.ramadhanberkah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.pbm.ramadhanberkah.Kisah.KisahParaSahabatNabi1Activity;

public class NgabuburitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngabuburit);

        //deklarasi variabel
        CardView cvKisah, cvSejarah;

        //Menginisialisasi id ke dalam variabel
        cvKisah = findViewById(R.id.cv_kisah);
        cvSejarah = findViewById(R.id.cv_sejarah);

//        cvKisah Event Handler Onclick
        cvKisah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NgabuburitActivity.this, KisahParaSahabatNabi1Activity.class);
                startActivity(intent);
            }
        });

        //cvSejarah Event Handler Onclick
//        cvSejarah.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(NgabuburitActivity.this, SejarahIslamActivity1.class);
//                startActivity(intent);
//            }
//        });
    }

}