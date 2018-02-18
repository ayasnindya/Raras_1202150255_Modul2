package id.ac.telkomuniversity.student.ayasnindya.raras_1202150255_modul2;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {
    private Button button_main;
    private TextInputLayout name,phone,alamat,catatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        //melakukan inisiasi untuk dapat mengklik button

        button_main = (Button)findViewById(R.id.button_main);
        button_main.setOnClickListener(new View.OnClickListener() {
            @Override

            // untuk menghubungkan dengan daftar menu activity
            public void onClick(View view) {
                Intent pesan = new Intent(getApplicationContext(),DaftarMenu.class);
                startActivity(pesan);

            }
        });
    }
    public void pesanan (View view){
        String nama = name.getEditText().getText().toString();
        String telepon = phone.getEditText().getText().toString();
        String address = alamat.getEditText().getText().toString();
        String notes = catatan.getEditText().getText().toString();

        if (nama.isEmpty()|| telepon.isEmpty() || address.isEmpty() || notes.isEmpty()){
            Toast.makeText(this,"Isi dulu cuy",Toast.LENGTH_LONG).show();
        }
        //mengirimkan nama dan jumlah ke dalam intent agar bisa di get pada class yang di tuju
        Intent c = new Intent(TakeAway.this,DaftarMenu.class);
        startActivity(c);
    }


    private void startActivity(TakeAway takeAway, Class<DaftarMenu> daftarMenuClass) {
    }


    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.tanggal_tombol));
    }

    public void showTimePickerDialog(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.waktu_tombol));
    }
    public void processDatePickerResult(int year, int month, int day) {
        String nama = name.getEditText().getText().toString();
        String telepon = phone.getEditText().getText().toString();

        if (nama.isEmpty() || telepon.isEmpty()) {
            Toast.makeText(this, "ISI TERLEBIH DAHULU", Toast.LENGTH_LONG).show();
        } else {
            //Memasukkan bulan pertama dan bulan selanjutnya
            String month_string = Integer.toString(month + 1);
            String day_string = Integer.toString(day);
            String year_string = Integer.toString(year);
            // Assign the concatenated strings to dateMessage.
            String dateMessage = (month_string + "/" + day_string + "/" + year_string);
            Toast.makeText(this, "Nama : " + nama + "\n Phone : " + telepon + "\n Waktu Mengambil Pesanan : " + getString(R.string.date) + dateMessage, Toast.LENGTH_SHORT).show();
        }
    }
    public void processTimePickerResult(int hourOfDay, int minute) {
        String nama = name.getEditText().getText().toString();
        String telepon = phone.getEditText().getText().toString();

        if (nama.isEmpty() || telepon.isEmpty()) {
            Toast.makeText(this, "ISI TERLEBIH DAHULU", Toast.LENGTH_LONG).show();
        } else {

            // melakukan convert kedalam waktu
            String hour_string = Integer.toString(hourOfDay);
            String minute_string = Integer.toString(minute);
            String timeMessage = (hour_string + ":" + minute_string);
            Toast.makeText(this, "Nama : " + nama + "\n Phone : " + telepon + "\n Waktu Mengambil Pesanan : " + getString(R.string.time) + timeMessage, Toast.LENGTH_SHORT).show();
        }

    }
}



