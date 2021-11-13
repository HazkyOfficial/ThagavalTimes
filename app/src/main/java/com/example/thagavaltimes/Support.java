package com.example.thagavaltimes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class Support extends AppCompatActivity {

    ///Initialize Variable
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        //Assign Variable
        drawerLayout = findViewById(R.id.drawerLayout);
    }


    public void ClickMenu(View view){
        MainActivity.openDrawer(drawerLayout);
    }

    public void ClickLogo(View view){
        MainActivity.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){
        MainActivity.redirectActivity(this,MainActivity.class);
    }

    public void ClickLiveNews(View view){
        MainActivity.redirectActivity(this,LiveNews.class);
    }

    public void ClickCoronaLiveTicker(View view){
        MainActivity.redirectActivity(this,CoronaLiveTicker.class);
    }

    public void ClickCategory(View view){
        MainActivity.redirectActivity(this,Category.class);
    }

    public void ClickInstagram(View view){
        MainActivity.redirectActivity(this,Instagram.class);
    }

    public void ClickSettings(View view){
        MainActivity.redirectActivity(this,Settings.class);
    }

    public void ClickSupport(View view){
        recreate();
    }

    public void ClickAboutUs(View view){
        MainActivity.redirectActivity(this,AboutUs.class);
    }
}