package id.ac.telkomuniversity.student.ayasnindya.raras_1202150255_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DineInActivity extends AppCompatActivity {
    private Spinner meja;
    private EditText nama;
    String hasil_meja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        //melakukan inisiasi untuk nama dan meja

        nama = (EditText) findViewById(R.id.name);
        meja = (Spinner) findViewById(R.id.label_spinner);

        }
        //untuk menampilkan toast dan ke activity selanjjutnya
    public void pesanSekarang(View view) {


        Toast.makeText(this, "nomer meja adalah : "+hasil_meja, Toast.LENGTH_SHORT).show();
        Intent i = new Intent(getApplicationContext(),DaftarMenu.class);
        startActivity(i);
      }



    private void startActivity(DineInActivity dineInActivity, Class<DaftarMenu> daftarMenuClass) {
    }


}


