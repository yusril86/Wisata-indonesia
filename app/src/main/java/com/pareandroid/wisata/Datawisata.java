package com.pareandroid.wisata;

import com.pareandroid.wisata.model.wisata;

import java.util.ArrayList;

public class Datawisata {
    public static String[][] data = new String[][]{
            {"Permandian Lumpue","Jl Tonrangeng ,Kota Pare-Pare, Sulawesi Selatan","https://1.bp.blogspot.com/-Y6hQKz-EM4U/WnViED3nraI/AAAAAAAAAFs/rkuGNFHsZLITCf45BJz24Crb24nIcW30gCLcBGAs/s1600/P1110172.JPG","Pantai Lumpue berada di Kelurahan Lumpue, Kecamatan Bacukiki Barat. Letak pantai ini berada dekat dari jalan poros Pare-Pare, sehingga bagi Anda yang ingin berkunjung tidak kesulitan mencari lokasi pantai. Pantai Lumpue merupakan pantai tertua yang terdapat di kota Pare-Pare Pantai populer yang selalu ramai pengunjung ini ternyata menyimpan cuplikan historis di masanya. Pantai yang berjarak 150 km dari Kota Makassar ini memiliki usia kurang lebih 50 tahun. Sudah dikenal sejak tahun 50-an, Pantai Lumpue digunakan oleh para nelayan sekitar sebagai tambatan perahu seusai mencari ikan di laut lepas"},
            {"Permandian Paputo"," Jl. Latassakka, Lumpue, Kota Pare-Pare,Sulawesi Selatan","https://scontent.cdninstagram.com/vp/2000c60f026a28f4ff37e9bf198cb466/5D848857/t51.2885-15/e35/c236.0.608.608a/s480x480/35180237_261970171202812_5129375550648877056_n.jpg?_nc_ht=scontent-ort2-1.cdninstagram.com", "Paputo baru dibuka dan dikelola pada awal Desember 2017 lalu. Dahulu Pantai yang dikenal dengan nama Pantai Tonrangeng. Paputo juga menyiapkan sebuah Cafe, Café New D’Carlos yang menyediakan berbagai makanan dan minuman dengan harga terjangkau. Jika anda tertarik, Paputo bisa dijadikan referensi libur akhir pekan anda. Tiket masuknya pun murah, cuma Rp5 ribu per orangnya."},
            {"Gunung Nona","Desa Bambapuang, kecamatan Anggeraja, Kabupaten Enrekang","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNQvwwi416CzW1CxVtX1FytcS0uZIpSI59OgtXGO4Ogy1fVhmA","Gunung Nona di Enrekang, Sulawesi Selatan disebut-sebut gunung yang unik. Nama gunungnya diambil karena warga sekitar menyebut bentuknya mirip Miss V. Warga sekitar menyebutnya Buttu Kabobong. Perbukitan di sekitar Gunung Nona menghadirkan sebuah pemandangan menarik. Namun yang menjadi daya tariknya tetap si Gunung Nona."}
    };

    public static ArrayList<wisata>getListData(){
        ArrayList<wisata> list = new ArrayList<>();
        for (String [] adata :data){
            wisata wisata =new wisata();
            wisata.setNama(adata[0]);
            wisata.setAlamat(adata[1]);
            wisata.setPhoto(adata[2]);
            wisata.setDeskripsi(adata[3]);

            list.add(wisata);
        }
        return list;
    }
}
