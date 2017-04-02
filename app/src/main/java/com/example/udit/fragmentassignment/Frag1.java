package com.example.udit.fragmentassignment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag1 extends Fragment {

    PassData passData;
    public Frag1() {
        // Required empty public constructor
    }
    EditText editText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag1, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        editText=(EditText) getActivity().findViewById(R.id.firstInput);
        passData=(PassData) getActivity();
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editText.getText().toString().length()!=0)
                    passData.firstInt(Integer.valueOf(editText.getText().toString()));
                else
                    passData.firstInt(0);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void getInt(){
        passData.firstInt(Integer.valueOf(editText.getText().toString()));
    }
}
