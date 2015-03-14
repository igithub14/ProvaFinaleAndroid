package edu.example.cristiano.provafinaleandroid;

/**
 * Created by Cristiano on 14/03/2015.
 *
 * */
    import android.os.Bundle;
    import android.view.View;
    import android.view.View.OnClickListener;
    import android.widget.Button;
    import android.app.Activity;
    import android.content.Intent;
    import android.app.Activity;
    import android.view.Menu;
    import android.view.MenuItem;




public class ChoiceActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choice_activity);

        Button btnAbout=(Button)findViewById(R.id.button1);
        btnAbout.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // definisco l'intenzione
                Intent openAbout = new Intent(ChoiceActivity.this,About.class);
                // passo all'attivazione dell'activity ChoiceActivity.java
                startActivity(openAbout);
            }
        });

        Button btnPortfolio=(Button)findViewById(R.id.button2);
        btnPortfolio.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // definisco l'intenzione
                Intent openPortfolio = new Intent(ChoiceActivity.this,Portfolio.class);
                // passo all'attivazione dell'activity ChoiceActivity.java
                startActivity(openPortfolio);
            }
        });

        Button btnUtilities=(Button)findViewById(R.id.button3);
        btnUtilities.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // definisco l'intenzione
                Intent openUtilities = new Intent(ChoiceActivity.this,Utilities.class);
                // passo all'attivazione dell'activity ChoiceActivity.java
                startActivity(openUtilities);
            }
        });

        Button btnBack=(Button)findViewById(R.id.button4);
        btnBack.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // definisco l'intenzione
                Intent openMainActivity = new Intent(ChoiceActivity.this,MainActivity.class);
                // passo all'attivazione dell'activity ChoiceActivity.java
                startActivity(openMainActivity);
            }
        });

    }


/**--------*/


    /**--------*/

}