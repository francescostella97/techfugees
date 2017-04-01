package com.example.utente.hackaton;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by ${Francesco} on 01/04/2017.
 */

public class Login extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Typeface custom = Typeface.createFromAsset(getAssets(),"fonts/Venetian.otf");
        TextView title = (TextView) findViewById(R.id.title_login);
        title.setTypeface(custom);

        ImageButton login = (ImageButton) findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,Home.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
