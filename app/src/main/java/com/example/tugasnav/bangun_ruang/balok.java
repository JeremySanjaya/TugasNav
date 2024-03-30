package com.example.tugasnav.bangun_ruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugasnav.R;

public class balok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);
        final EditText panjangEditText = findViewById(R.id.panjang);
        final EditText lebarEditText = findViewById(R.id.lebar);
        final EditText tinggiEditText = findViewById(R.id.tinggi);
        final TextView hasilTextView = findViewById(R.id.hasil);
        Button hitungButton = findViewById(R.id.btn_hasil);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjangString = panjangEditText.getText().toString();
                String lebarString = lebarEditText.getText().toString();
                String tinggiString = tinggiEditText.getText().toString();

                if (!panjangString.isEmpty() && !lebarString.isEmpty() && !tinggiString.isEmpty()) {
                    double panjang = Double.parseDouble(panjangString);
                    double lebar = Double.parseDouble(lebarString);
                    double tinggi = Double.parseDouble(tinggiString);

                    double luasPermukaan = hitungLuasPermukaanBalok(panjang, lebar, tinggi);

                    hasilTextView.setText("Luas Permukaan: " + luasPermukaan);
                } else {
                    hasilTextView.setText("Masukkan panjang, lebar, dan tinggi");
                }
            }
        });
    }

    private double hitungLuasPermukaanBalok(double panjang, double lebar, double tinggi) {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
}
