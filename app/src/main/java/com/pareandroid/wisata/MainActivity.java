package com.pareandroid.wisata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.pareandroid.wisata.model.wisata;
import com.pareandroid.wisata.WisataAdapter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

 private RecyclerView rvkategori;

 private ArrayList<wisata> list= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvkategori = findViewById(R.id.rv_kategori);
        rvkategori.setHasFixedSize(true);

        list.addAll(Datawisata.getListData());
        showRecylerlist();
    }

    private void showRecylerlist (){
        rvkategori.setLayoutManager(new LinearLayoutManager(this));
        WisataAdapter wisataAdapter = new WisataAdapter(this);
        wisataAdapter.setListwisata(list);
        rvkategori.setAdapter(wisataAdapter);
    }


}
