package com.example.deer.learnfragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnAddFragment;
    private Button btnRemoveFragment;

    private static final String TAG_HOME_FRAGMENT = "tag_home_fragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.layout_fragment_container, HomeFragment.newInstance())
                    .addToBackStack(null)
                    .commit();
        }

        btnAddFragment = (Button) findViewById(R.id.btn_add_fragment);
        btnRemoveFragment = (Button) findViewById(R.id.btn_remove_fragment);

        btnAddFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add fragment on ViewGroup(FrameLayout)
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.layout_fragment_container,
                                HomeFragment.newInstance(),
                                TAG_HOME_FRAGMENT)
                        .commit();
            }
        });

        btnRemoveFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Remove fragment on ViewGroup(FrameLayout)

                Fragment fragment = getSupportFragmentManager().findFragmentByTag(TAG_HOME_FRAGMENT);
                if (fragment != null) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .remove(fragment)
                            .commit();
                }

            }
        });
    }
}
