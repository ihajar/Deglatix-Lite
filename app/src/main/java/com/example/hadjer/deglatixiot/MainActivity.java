package com.example.hadjer.deglatixiot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton One,Two,Three,Four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        One=(ImageButton)findViewById(R.id.btntemperature);
        Two=(ImageButton)findViewById(R.id.btnlight);
        Three=(ImageButton)findViewById(R.id.btnhumid);
        Four=(ImageButton)findViewById(R.id.btnsoil);


        One.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenttemperature = new Intent(v.getContext(), Activity1.class);
                startActivity(intenttemperature);
            }
        });

        Two.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentlight = new Intent(v.getContext(), Activity2.class);
                startActivity(intentlight);
            }
        });

        Three.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenthumid = new Intent(v.getContext(), Activity3.class);
                startActivity(intenthumid);
            }
        });

        Four.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentsoil = new Intent(v.getContext(), Activity4.class);
                startActivity(intentsoil);
            }
        });



    }
}
