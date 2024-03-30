package com.example.tugasnav.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.tugasnav.R;
import com.example.tugasnav.bangun_ruang.balok;
import com.example.tugasnav.bangun_ruang.kerucut;
import com.example.tugasnav.bangun_ruang.kubus;
import com.example.tugasnav.bangun_ruang.limas;
import com.example.tugasnav.bangun_ruang.tabung;

public class ruang extends Fragment {

    ImageView balokButton;
    ImageView kerucutButton;
    ImageView limasButton;
    ImageView tabungButton;
    ImageView kubusButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ruang, container, false);

        balokButton = view.findViewById(R.id.balok);
        kerucutButton = view.findViewById(R.id.kerucut);
        limasButton = view.findViewById(R.id.limas);
        tabungButton = view.findViewById(R.id.tabung);
        kubusButton = view.findViewById(R.id.kubus);

        balokButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), balok.class);
                startActivity(intent);
            }
        });

        kerucutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), kerucut.class);
                startActivity(intent);
            }
        });

        limasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), limas.class);
                startActivity(intent);
            }
        });

        tabungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), tabung.class);
                startActivity(intent);
            }
        });

        kubusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), kubus.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
