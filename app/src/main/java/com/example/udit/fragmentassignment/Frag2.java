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
public class Frag2 extends Fragment {


    private EditText editText;
    PassData passData;
    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag2, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        editText=(EditText) getActivity().findViewById(R.id.secondInput);
        passData=(PassData) getActivity();
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(editText.getText().toString().length()!=0)
                    passData.secondInt(Integer.valueOf(editText.getText().toString()));
                else
                    passData.secondInt(0);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void getInt(){
        passData.secondInt(Integer.valueOf(editText.getText().toString()));
    }
}
