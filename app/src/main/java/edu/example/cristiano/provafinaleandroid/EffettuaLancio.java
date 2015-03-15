package edu.example.cristiano.provafinaleandroid;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;
import java.util.Random;

/**
 * Created by Cristiano on 15/03/2015.
 */


public class EffettuaLancio extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.effettualancio);


        Random rand = new Random();

        int val1 = rand.nextInt(6) + 1;
        int val2 = rand.nextInt(6) + 1;
        int res = val1 + val2;
        String str = Integer.toString(res);
        //toast che mostra popup riultato
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();




        /*Gestione bottoni back e home*/
        Button btnBack=(Button)findViewById(R.id.buttonBack);
        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // definisco l'intenzione
                Intent openLancioDadi = new Intent(EffettuaLancio.this,LancioDadi.class);
                // passo all'attivazione dell'activity ChoiceActivity.java
                startActivity(openLancioDadi);
            }
        });

        Button btnHome=(Button)findViewById(R.id.buttonHome);
        btnHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // definisco l'intenzione
                Intent openMainActivity = new Intent(EffettuaLancio.this,MainActivity.class);
                // passo all'attivazione dell'activity ChoiceActivity.java
                startActivity(openMainActivity);
            }
        });
/*fiNE Gestione bottoni back e home*/
    }

}