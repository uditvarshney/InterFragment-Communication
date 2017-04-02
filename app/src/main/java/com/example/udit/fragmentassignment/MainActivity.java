package com.example.udit.fragmentassignment;

import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements PassData{

    Fragment frag_1,frag_2,frag_3;
    ConstraintLayout layout;
    private int n,m;
    private Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //layout=(ConstraintLayout) findViewById(R.id.clayout);
        frag_1=new Frag1();
        frag_2=new Frag2();
        frag_3=new Frag3();
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.layout1,frag_1,"frag1");
        transaction.add(R.id.layout1,frag_2,"frag2");
        transaction.add(R.id.layout1,frag_3,"frag3");
        transaction.commit();

    }

    @Override
    public void firstInt(int n) {
        this.n=n;
        Frag2 B=(Frag2) getSupportFragmentManager().findFragmentByTag("frag2");
        B.getInt();
    }

    @Override
    public void secondInt(int m) {
        this.m=m;
        Frag3 C=(Frag3) getSupportFragmentManager().findFragmentByTag("frag3");
        C.changeText(String.valueOf(n+m));
    }

}
