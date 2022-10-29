package com.example.cuide_se;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Switch;

import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class TelaCategoria extends AppCompatActivity {
        DrawerLayout drawerLayout;
        NavigationView navigationView;
        ActionBarDrawerToggle drawerToggle;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_tela_categoria);
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.greencuide)));



            drawerLayout = findViewById(R.id.drawer_layout);
            navigationView = findViewById(R.id.nav_view);
            drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
            drawerLayout.addDrawerListener(drawerToggle);

            drawerToggle.syncState();
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Intent intent;
                    switch(item.getItemId()){
                        case R.id.home:
                            startActivity(new Intent(getApplicationContext(), TelaLogin.class));
                            break;
                    }
                    return false;
                }
            });


        }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }

    }
}