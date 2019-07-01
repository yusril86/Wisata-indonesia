package com.pareandroid.wisata;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.pareandroid.wisata.model.wisata;

import java.util.ArrayList;

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.CardViewViewHolder> {

    private ArrayList<wisata> listwisata;
    private Context context;

    public WisataAdapter(Context context){
        this.context =context;
    }


    public void setListwisata (ArrayList<wisata> list){
        this.listwisata =list;
    }

    private ArrayList<wisata> getListwisata(){
        return listwisata;
    }




    @NonNull
    @Override
    public WisataAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wisata_list,viewGroup,false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WisataAdapter.CardViewViewHolder cardViewViewHolder, int i) {
    wisata wisata = getListwisata().get(i);

        Glide.with(context)
                .load(wisata.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(cardViewViewHolder.imgPhoto);

        cardViewViewHolder.tv_wisata.setText(listwisata.get(i).getNama());
        cardViewViewHolder.tv_alamat.setText(listwisata.get(i).getAlamat());
        cardViewViewHolder.tv_deskripsi.setText(listwisata.get(i).getDeskripsi());

        final String nama = listwisata.get(i).getNama();
        final String alamat = listwisata.get(i).getAlamat();
        final String deskripsi = listwisata.get(i).getDeskripsi();
        final String photo = listwisata.get(i).getPhoto();



        cardViewViewHolder.cd_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PassingData.class);
                intent.putExtra("nama",nama);
                intent.putExtra("alamat",alamat);
                intent.putExtra("deskripsi",deskripsi);
                intent.putExtra("photo",photo);
                context.startActivity(intent);
//                Toast.makeText(context,"Berhasil" ,Toast.LENGTH_SHORT).show();
            }


        });

    }

    @Override
    public int getItemCount() {

        return getListwisata().size();
    }

     class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tv_alamat,tv_wisata,tv_deskripsi;
        CardView cd_item;

         CardViewViewHolder(@NonNull View itemView){
            super(itemView);
            tv_alamat= itemView.findViewById(R.id.tv_alamat);
            tv_wisata = itemView.findViewById(R.id.tv_nama_wisata);
            tv_deskripsi = itemView.findViewById(R.id.tv_deskripsi);
            imgPhoto = itemView.findViewById(R.id.img_item);
            cd_item = itemView.findViewById(R.id.card_view);

        }
    }
}
