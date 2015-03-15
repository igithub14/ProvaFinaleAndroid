package edu.example.cristiano.provafinaleandroid;

/**
 * Created by Cristiano on 14/03/2015.
 */

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import java.util.Random;


public class LancioDadi extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lanciodadi);







/*Gestione bottone del lancio*/

        Button btnFaiLancio=(Button)findViewById(R.id.buttonFaiLancio);
        btnFaiLancio.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // definisco l'intenzione
                Intent openEffettualancio = new Intent(LancioDadi.this,EffettuaLancio.class);
                // passo all'attivazione dell'activity ChoiceActivity.java
                startActivity(openEffettualancio);
              
            }
        });

        /*Gestione bottoni back e home*/
        Button btnBack=(Button)findViewById(R.id.buttonBack);
        btnBack.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // definisco l'intenzione
                Intent openUtilities = new Intent(LancioDadi.this,Utilities.class);
                // passo all'attivazione dell'activity ChoiceActivity.java
                startActivity(openUtilities);
            }
        });

        Button btnHome=(Button)findViewById(R.id.buttonHome);
        btnHome.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // definisco l'intenzione
                Intent openMainActivity = new Intent(LancioDadi.this,MainActivity.class);
                // passo all'attivazione dell'activity ChoiceActivity.java
                startActivity(openMainActivity);
            }
        });
/*fiNE Gestione bottoni back e home*/


    }
}