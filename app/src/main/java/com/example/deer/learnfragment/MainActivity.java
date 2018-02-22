package com.example.deer.learnfragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOne = (Button) findViewById(R.id.btn_one);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OneFragment oneFragment = new OneFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.layout_fragment_container, oneFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        Button btnTwo = (Button) findViewById(R.id.btn_two);
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TwoFragment twoFragment = new TwoFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.layout_fragment_container, twoFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        Button btnThree = (Button) findViewById(R.id.btn_three);
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ThreeFragment threeFragment = new ThreeFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.layout_fragment_container, threeFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }
}
