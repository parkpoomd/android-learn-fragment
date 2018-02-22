package com.example.deer.learnfragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {
    private static final String EXTRA_KEY = "extra_key";

    public MyFragment() {
        // Required empty public constructor
    }

    public static MyFragment newInstance(String key) {
        MyFragment fragment = new MyFragment();
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_KEY, key);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String key = getArguments().getString(EXTRA_KEY);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my, container, false);
    }

}
