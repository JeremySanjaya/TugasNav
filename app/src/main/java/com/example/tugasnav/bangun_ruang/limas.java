package com.example.tugasnav.bangun_ruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugasnav.R;

public class limas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limas);
        final EditText alasEditText = findViewById(R.id.alas);
        final EditText tinggiEditText = findViewById(R.id.tinggi);
        final EditText sisiTegakEditText = findViewById(R.id.sisi_tegak);
        final TextView hasilTextView = findViewById(R.id.hasil);
        Button hitungButton = findViewById(R.id.btn_hasil);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alasString = alasEditText.getText().toString();
                String tinggiString = tinggiEditText.getText().toString();
                String sisiTegakString = sisiTegakEditText.getText().toString();

                if (!alasString.isEmpty() && !tinggiString.isEmpty() && !sisiTegakString.isEmpty()) {
                    double alas = Double.parseDouble(alasString);
                    double tinggi = Double.parseDouble(tinggiString);
                    double sisiTegak = Double.parseDouble(sisiTegakString);

                    double luasPermukaan = hitungLuasPermukaanLimas(alas, tinggi, sisiTegak);

                    hasilTextView.setText("Luas Permukaan: " + luasPermukaan);
                } else {
                    hasilTextView.setText("Masukkan panjang alas, tinggi, dan sisi tegak");
                }
            }
        });
    }

    private double hitungLuasPermukaanLimas(double alas, double tinggi, double sisiTegak) {
        double luasAlas = alas * alas;
        double luasSisiTegak = 4 * ((alas * tinggi) / 2); // Menggunakan rumus luas segitiga: 0.5 * alas * tinggi

        return luasAlas + luasSisiTegak;
    }
}
