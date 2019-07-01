package com.pareandroid.wisata;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.pareandroid.wisata.R;

public class PassingData extends AppCompatActivity {

    TextView tv_nama,tv_alamat,tv_deskripsi;
    ImageView img_wisata;
    String nama , alamat , deskripsi,photo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_data);


         tv_nama = findViewById(R.id.tv_psg_judul);
         tv_alamat = findViewById(R.id.tv_psg_alamat);
         tv_deskripsi = findViewById(R.id.tv_psg_deskripsi);
         img_wisata = findViewById(R.id.img_passing);



         nama = getIntent().getStringExtra("nama");
         alamat = getIntent().getStringExtra("alamat");
         deskripsi = getIntent().getStringExtra("deskripsi");
         photo = getIntent().getStringExtra("photo");

        Glide.with(this)
                .load(photo)
                .into(img_wisata);

        tv_nama.setText(nama);
        tv_alamat.setText(alamat);
        tv_deskripsi.setText(deskripsi);

    }
}
