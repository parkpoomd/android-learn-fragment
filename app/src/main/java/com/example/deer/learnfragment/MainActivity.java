package com.example.deer.learnfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String key = "ANY_VALUE";

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.layout_fragment_container, MyFragment.newInstance(key))
                .commit();
    }
}
