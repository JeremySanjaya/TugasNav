package com.example.tugasnav.bangun_ruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugasnav.R;

public class tabung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);
        final EditText alasEditText = findViewById(R.id.jari_jari);
        final EditText tinggiEditText = findViewById(R.id.tinggi);
        final TextView hasilTextView = findViewById(R.id.hasil);
        Button hitungButton = findViewById(R.id.btn_hasil);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alasString = alasEditText.getText().toString();
                String tinggiString = tinggiEditText.getText().toString();

                if (!alasString.isEmpty() && !tinggiString.isEmpty()) {
                    double jari_jari = Double.parseDouble(alasString);
                    double tinggi = Double.parseDouble(tinggiString);

                    double luasPermukaan = hitungLuasPermukaanTabung(jari_jari, tinggi);

                    hasilTextView.setText("Luas Permukaan: " + luasPermukaan);
                } else {
                    hasilTextView.setText("Masukkan panjang alas dan tinggi");
                }
            }
        });
    }

    private double hitungLuasPermukaanTabung(double jari_jari, double tinggi) {
        return 2 * Math.PI * jari_jari * (jari_jari + tinggi);
    }
}
