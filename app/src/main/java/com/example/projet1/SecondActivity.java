package com.example.projet1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView textview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
        textview1 = (TextView)findViewById(R.id.textView1);
       // Récupération de la valeur éditée dans la première activité avec la méthode getIntent(). Question b)
        Intent intent = getIntent();
        String v= "" ;
        if (intent != null)   v=intent.getStringExtra("clé");
        textview1.setText(v);

        popUp("onCreate1()");


    }
    @Override
    protected void onRestart() {
        super.onRestart();
        popUp("onRestart1()");
    }
    @Override
    protected void onStart() {

        super.onStart();


        popUp("onStart1()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        //Question a) du tp 01
        //récupération de la valeur éditée dans l'activité principale via Sharedpreferences
       /** SharedPreferences settings = getSharedPreferences("cycle_vie_prefs", Context.MODE_PRIVATE);
        textview1.setText(settings.getString("valeur", ""));
        popUp("onResume1()");*/

    }
    @Override
    protected void onPause() {
        super.onPause();
        popUp("OnPause1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        popUp("onStop1()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        popUp("onDestroy1()");
    }
    public void popUp(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

}