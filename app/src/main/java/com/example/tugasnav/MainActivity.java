package com.example.tugasnav;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.tugasnav.fragment.datar;
import com.example.tugasnav.fragment.profile;
import com.example.tugasnav.fragment.ruang;
import com.example.tugasnav.fragment.datar;
import com.example.tugasnav.fragment.profile;
import com.example.tugasnav.fragment.ruang;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottom_nav_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottom_nav_view = findViewById(R.id.bottomView); // Ubah bottomView menjadi bottom_nav_view
        bottom_nav_view.setOnNavigationItemSelectedListener(navListener);

        // Load the default fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.flFragment, new profile()) // Ganti bottomView dengan fragment_container
                .commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    if (item.getItemId() == R.id.profile) {
                        selectedFragment = new profile();
                    } else if (item.getItemId() == R.id.datar) {
                        selectedFragment = new datar();
                    } else if (item.getItemId() == R.id.ruang) {
                        selectedFragment = new ruang();
                    }


                    if (selectedFragment != null) {
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.flFragment, selectedFragment) // Ganti bottomView dengan fragment_container
                                .commit();
                        return true;
                    }
                    return false;
                }
            };
}
