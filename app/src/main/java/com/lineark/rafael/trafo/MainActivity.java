package com.lineark.rafael.trafo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import  android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

private TextView Compania;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View A) {
        TextView Compañia = (TextView)findViewById(R.id.CompañiaE);

        Intent MiIntent = new Intent(this,PA1.class);

        MiIntent.putExtra("data",Compañia.getText().toString());

        startActivity(MiIntent);
    }

}
