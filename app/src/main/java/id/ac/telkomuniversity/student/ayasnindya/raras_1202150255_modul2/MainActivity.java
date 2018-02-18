package id.ac.telkomuniversity.student.ayasnindya.raras_1202150255_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton_sini;
    private RadioButton radioButton_pulang;
    private Button button1;
    private RadioButton radioButton;

    public void showToast(View view) {
        // Create a toast show it.
        Toast toast = Toast.makeText(getBaseContext(), "RARAS_1202150255", Toast.LENGTH_LONG);
        toast.show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //membuat atribut

        radioButton_sini = (RadioButton) findViewById(R.id.dinein);
        radioButton_pulang = (RadioButton) findViewById(R.id.takeaway);

        //untuk setting button

        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        Button btSubmit = (Button) findViewById(R.id.button1);
        btSubmit.setOnClickListener(new View.OnClickListener() {

            //Mengatur radiobutton jika diklik
            @Override
            public void onClick(View view) {

                int id = radioGroup.getCheckedRadioButtonId();
                switch (id) {

                    case R.id.dinein:
                        //untuk menampilkan pesan toast ketika di klik
                        Toast.makeText(getBaseContext(), "Dine In Selected ",
                                Toast.LENGTH_SHORT).show();
                        //untuk menghubungkan aktivitas menu utama ke take away
                        Intent dinein = new Intent(getApplicationContext(),DineInActivity.class);
                        startActivity(dinein);

                        break;
                    case R.id.takeaway:
                        //untuk menampilkan pesan toast ketika di klik
                        Toast.makeText(getBaseContext(), "Take Away Selected  ",
                                Toast.LENGTH_SHORT).show();

                        //untuk menghubungkan menu utama ke tampilan dinein
                        Intent takeaway = new Intent(getApplicationContext(),TakeAway.class);
                        startActivity(takeaway);
                        break;
                }
            }
        });

    }


}