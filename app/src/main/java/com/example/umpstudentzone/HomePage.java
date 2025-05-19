package com.example.umpstudentzone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        MaterialToolbar toolbar = findViewById(R.id.toolBar);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        /*Navigation code that open and closes navigation bar*/
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();
                drawerLayout.closeDrawer(GravityCompat.START);
                switch (id)
                {
                    case R.id.home_menu:
                        Toast.makeText(HomePage.this, "Home Page", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.about_menu:
                        Toast.makeText(HomePage.this, "About Page", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.setting_menu:
                        Toast.makeText(HomePage.this, "Settings Page", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.profile_menu:
                        Toast.makeText(HomePage.this, "Profile Page", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.logout_menu:
                        Toast.makeText(HomePage.this, "Logged out", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.message_menu:
                        Toast.makeText(HomePage.this, "Message Page", Toast.LENGTH_SHORT).show();
                        break;

                    default:
                        return true;

                }

                return true;
            }
        });

        //**********Coding of declaring buttons or images to open actual courses**********

        //declaring code to open another activity Dip Agr
        ImageView dipagr = findViewById(R.id.dip_agr);
        dipagr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this, DipAgr.class);
                startActivity(i);
            }
        });

        //declaring code to open another activity Dip Ani
        ImageView dipani = findViewById(R.id.dip_ani);
        dipani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this, DipAni.class);
                startActivity(i);
            }
        });

        //declaring code to open another activity Dip Con
        ImageView dipcon = findViewById(R.id.dip_con);
        dipcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this, DipCon.class);
                startActivity(i);
            }
        });

        //declaring code to open another activity Dip Hos
        ImageView diphos = findViewById(R.id.dip_hos);
        diphos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomePage.this, DipHos.class);
                startActivity(i);
            }
        });

        }
}