package com.example.tugasnav.bangun_ruang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugasnav.R;

public class kubus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);
        final EditText sisiEditText = findViewById(R.id.sisi);
        final TextView hasilTextView = findViewById(R.id.hasil);
        Button hitungButton = findViewById(R.id.btn_hasil);

        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sisiString = sisiEditText.getText().toString();

                if (!sisiString.isEmpty()) {
                    double sisi = Double.parseDouble(sisiString);

                    double luasPermukaan = hitungLuasPermukaanKubus(sisi);

                    hasilTextView.setText("Luas Permukaan: " + luasPermukaan);
                } else {
                    hasilTextView.setText("Masukkan panjang sisi");
                }
            }
        });
    }

    private double hitungLuasPermukaanKubus(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }
}
