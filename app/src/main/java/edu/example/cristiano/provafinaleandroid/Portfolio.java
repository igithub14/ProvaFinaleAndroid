package edu.example.cristiano.provafinaleandroid;

/**
 * Created by Cristiano on 14/03/2015.
 */

        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.app.Activity;
        import android.content.Intent;
        import android.app.Activity;
        import android.view.Menu;
        import android.view.MenuItem;

public class Portfolio extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.portfolio);

        Button btnBack=(Button)findViewById(R.id.buttonBack);
        btnBack.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // definisco l'intenzione
                Intent openChoiceActivity = new Intent(Portfolio.this,ChoiceActivity.class);
                // passo all'attivazione dell'activity ChoiceActivity.java
                startActivity(openChoiceActivity);
            }
        });

        Button btnHome=(Button)findViewById(R.id.buttonHome);
        btnHome.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // definisco l'intenzione
                Intent openMainActivity = new Intent(Portfolio.this,MainActivity.class);
                // passo all'attivazione dell'activity ChoiceActivity.java
                startActivity(openMainActivity);
            }
        });



    }
}