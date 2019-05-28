package com.example.taufiq.reminder;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

     Toolbar theToolbar;
     BottomNavigationView bottomNavigationView;
     List<DataModel> listOfData = new ArrayList<>();
     RecyclerView recyclerView;
     ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_app_bar);


        theToolbar = findViewById(R.id.the_toolbar);
        setSupportActionBar(theToolbar);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.dashboard:
                        Toast.makeText(MainActivity.this, "Home Page", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.person:
                        Toast.makeText(MainActivity.this, "User Page", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.settings:
                        Toast.makeText(MainActivity.this, "Setting Page", Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;
            }
        });

        theItem();
        initRecyclerView();

    }


    private void theItem() {

        DataModel item1 = new DataModel("M. Taufiq ", "2s ago", "10", "5");
        listOfData.add(item1);

        DataModel item2 = new DataModel("Muh Andys", "16m ago", "120", "16");
        listOfData.add(item2);

        DataModel item3 = new DataModel("Kamelia", "30m ago", "150", "20");
        listOfData.add(item3);

        DataModel item4 = new DataModel("Maskur", "1h ago", "160", "100");
        listOfData.add(item4);

        DataModel item5 = new DataModel("Zulfajri S", "1h ago","200", "40");
        listOfData.add(item5);

        DataModel item6 = new DataModel("Michail Amin", "2h ago", "300", "100");
        listOfData.add(item6);

        DataModel item7 = new DataModel("Amru Alfatih", "2h ago", "350", "90");
        listOfData.add(item7);

    }


    private void initRecyclerView(){
        adapter = new ItemAdapter(this,listOfData);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }




}
