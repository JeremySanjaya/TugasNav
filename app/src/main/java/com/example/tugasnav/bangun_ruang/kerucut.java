package com.example.tugasnav.bangun_ruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugasnav.R;

public class kerucut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);
        final EditText jariJariEditText = findViewById(R.id.jari_jari);
        final EditText tinggiEditText = findViewById(R.id.tinggi);
        final TextView hasilTextView = findViewById(R.id.hasil);
        Button hitungButton = findViewById(R.id.btn_hasil);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jariJariString = jariJariEditText.getText().toString();
                String tinggiString = tinggiEditText.getText().toString();

                if (!jariJariString.isEmpty() && !tinggiString.isEmpty()) {
                    double jariJari = Double.parseDouble(jariJariString);
                    double tinggi = Double.parseDouble(tinggiString);

                    double luasPermukaan = hitungLuasPermukaanKerucut(jariJari, tinggi);

                    hasilTextView.setText("Luas Permukaan: " + luasPermukaan);
                } else {
                    hasilTextView.setText("Masukkan jari-jari alas dan tinggi");
                }
            }
        });
    }

    private double hitungLuasPermukaanKerucut(double jariJari, double tinggi) {
        return Math.PI * jariJari * (jariJari + Math.sqrt(Math.pow(tinggi, 2) + Math.pow(jariJari, 2)));
    }
}
