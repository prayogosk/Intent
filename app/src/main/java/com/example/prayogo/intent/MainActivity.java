package com.example.prayogo.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button explicitButton;
    private Button inplicitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        explicitButton = findViewById(R.id.explicit_button);
        inplicitButton = findViewById(R.id.inplicit_button);

        explicitButton.setOnClickListener(this);
        inplicitButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.explicit_button){
            //action explicit
            Intent intent = new Intent(MainActivity.this, InformasiActivity.class);
            startActivity(intent);
        } else if(view.getId() == R.id.inplicit_button){
            //action inplicit
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kode.id/users/sign_in"));
            startActivity(browserIntent);
        }

    }
}