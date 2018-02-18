package id.ac.telkomuniversity.student.ayasnindya.raras_1202150255_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MenuListAdapter menuAdapter;

    public static ArrayList<MenuModel> menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        //untuk melakukan inisiasi

        menuList = isiMenu();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        menuAdapter = new MenuListAdapter(menuList);
        recyclerView.setAdapter(menuAdapter);

        //untuk menampilkan recyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public ArrayList<MenuModel> isiMenu(){
        ArrayList<MenuModel> data = new ArrayList<>();

        //MenuModel(String nama, int harga, int gambar, String deskripsi)
        data.add(new MenuModel("Nasi Goreng", 18000, R.drawable.nasi_goreng, "Nasi, Telur, Bumbu Nasigoreng"));
        data.add(new MenuModel("Mie Goreng", 21273, R.drawable.mie_goreng, "Mie, Telur ,kecap"));
        data.add(new MenuModel("Mie Kuah", 14000, R.drawable.mie_kuah, "MIe, Telur, smokebeef"));
        data.add(new MenuModel("Nasi Waqyu", 14000, R.drawable.nasi_wagyu, "Nasi,Telor, Daging"));
        data.add(new MenuModel("Bakmie Jawa", 18040, R.drawable.bakmi_jawa, "mie, telur, ayam, bumbu khas "));
        data.add(new MenuModel("Ayam Geprek", 18182, R.drawable.ayam_geprek, "Nasi, ayam goreng + sambal yang di uleg"));
        data.add(new MenuModel("Ayam Lada Hitam", 19909, R.drawable.nasi_ayam, "Nasi, ayam, bumbu lada hitam"));
        return data;
    }

}
