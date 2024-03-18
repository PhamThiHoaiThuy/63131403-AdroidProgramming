package com.example.lvnangcao;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;
import android.os.Bundle;
import java.util.ArrayList;
import com.example.lvnangcao.Adapter.CountryAdapter;
import com.example.lvnangcao.model.Country;

public class MainActivity extends AppCompatActivity {

    ArrayList<Country> dsQG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //b1
        dsQG = new ArrayList<Country>();
        dsQG.add(new Country("Vietnam", 90, "co1"));
        dsQG.add(new Country("Russia", 110, "co2"));
        dsQG.add(new Country("United State", 80, "co3"));

        ListView listView = findViewById(R.id.lvQG);

        CountryAdapter adapter = new CountryAdapter(this, dsQG);
        listView.setAdapter(adapter);


    }
}