package com.spp.klaz.day2review;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag1ButtonControl extends Fragment implements View.OnClickListener {

    Button keiBtnHome, keiBtnMemo;

    public Frag1ButtonControl() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.frag1_button_control, container, false);

        keiBtnHome = (Button) view.findViewById(R.id.keiBtnHome);
        keiBtnMemo = (Button) view.findViewById(R.id.keiBtnMemo);

        // ---------------- //

        keiBtnHome.setOnClickListener(this);
        keiBtnMemo.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.keiBtnHome:
                Fragment keiFragMainHome = new Frag3MainHome();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.keiContentView, keiFragMainHome, keiFragMainHome.getTag());
                ft.commit();

                Toast.makeText(getActivity(), "Home Sweet Home", Toast.LENGTH_SHORT).show();
                break;

            case R.id.keiBtnMemo:
                Fragment keiFragMainMemo = new Frag4MainMemo();
                fm = getActivity().getSupportFragmentManager();
                ft = fm.beginTransaction();
                ft.replace(R.id.keiContentView, keiFragMainMemo, keiFragMainMemo.getTag());
                ft.commit();

                Toast.makeText(getActivity(), "Directing to Memo", Toast.LENGTH_SHORT).show();
                break;

        }


    }

}
