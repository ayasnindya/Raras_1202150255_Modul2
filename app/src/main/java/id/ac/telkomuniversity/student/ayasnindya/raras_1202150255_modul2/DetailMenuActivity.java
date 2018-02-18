package id.ac.telkomuniversity.student.ayasnindya.raras_1202150255_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class DetailMenuActivity extends AppCompatActivity {
    private ArrayList menus;
    private String idMenu;
    private TextView nama, harga, komposisi;
    private ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        //melakukan inisiasi untuk methodnya

        nama = (TextView)findViewById(R.id.namaMakanan);
        harga = (TextView)findViewById(R.id.harga);
        komposisi = (TextView)findViewById(R.id.komposisiMakanan);
        gambar = (ImageView) findViewById(R.id.detailGambar);
//
        menus = DaftarMenu.menuList;
        Intent q = getIntent();
        idMenu = q.getStringExtra("MenuID");
        Log.d("DETAILED MENU","ID:"+idMenu);
        MenuModel menu = (MenuModel) menus.get(Integer.parseInt(idMenu));
        nama.setText(menu.getNama());
        setTitle(menu.getNama());
        harga.setText(""+ NumberFormat.getCurrencyInstance(new Locale("in", "ID")).format(menu.getHarga()) +",- / Porsi");
        komposisi.setText(menu.getKomposisi());
        gambar.setImageResource(menu.getGambar());
    }

}


